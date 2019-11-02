import Vue from 'vue'
import Vuex from 'vuex'
//인스턴스안에서 쓰는게 아니기때문에 임포트해줘야한다.
import router from '../router'
import axios from 'axios'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    userInfo: null,
    allUsers: [
      { id: 1, name: "hoza", email: "hoza@gmail.com", password: "123456" },
      { id: 2, name: "lego", email: "lego@gmail.com", password: "123456" },
    ],
    isLogin: false,
    isLoginError: false
  },
  mutations: {
    //로그인이 성공했을 때
    loginSuccess(state, payload) {
      state.isLogin = true
      state.isLoginError = false
      state.userInfo = payload
    },
    //로그인이 실패했을 때
    loginError(state) {
      state.isLogin = false
      state.isLoginError = true
    },
    logout(state) {
      state.isLogin = false
      state.isLoginError = false
      state.userInfo = null
    }
  },
  actions: {
    //로그인 시도
    login({ dispatch }, loginObj) {
      //전체 유저에서 해당 이메일로 유저를 찾는다.
      //그 유저의 비밀번호와 입력된 비밀번호를 비교한다.
      // let selectedUser = null
      // state.allUsers.forEach(user => {
      //   if(user.email === loginObj.email) selectedUser = user
      // })
      // if(selectedUser === null || selectedUser.password !== loginObj.password)
      //   commit('loginError')
      //   else {
      //     commit('loginSuccess', selectedUser)
      //     router.push({ name : "mypage"})
      //   }
        //post는 object를 body에 담아서 보냄
        axios //로그인 -> 토큰 반환
        .post("https://reqres.in/api/login", loginObj)
        .then(res => { //function으로 하면 메소드 내부를 가리키기 때문에 에로우 펑션으로 전체 인스턴스를 가리켜야한다.
          //성공시 토큰 반환, 헤더에 토큰을 포함시켜서 유저정보 요청
          let token = res.data.token
          //토큰을 로컬 스토리지에 저장
          localStorage.setItem("access-token", token)
          dispatch("getMemberInfo")
          .catch(() => {
            alert("이메일과 비밀번호를 확인하세요.")
          })
        })
        .catch(() => {
          alert("이메일과 비밀번호를 확인하세요.")
        })
        // .then(() => {
        //   //항상 반환
        // })
      },
      logout({commit}) {
        localStorage.removeItem("access-token")
        commit('logout')
        router.push({ name : "home" })
      },
      getMemberInfo({ commit }) {
        //로컬스토리지의 토큰을 불러옴
        let token = localStorage.getItem("access-token")
        if( token !== null){
        let config = { //헤더값 설정해주는 개게
          headers: {
            "access-token": token
          }
        }
        //토큰으로 멤버 정보를 반환
        //새로고침 -> 토큰만 가지고 멤버정보를 요청
        axios
        .get("https://reqres.in/api/users/2", config)
        .then(response => {
          let userInfo = {
            id: response.data.data.id,
            first_name: response.data.data.first_name,
            last_name: response.data.data.last_name,
            avatar: response.data.data.avatar
          }
          commit("loginSuccess", userInfo) //response.data.data를 직접 넣어줘도 무방
        })
      }
    }
  },
  modules: {
  }
})
