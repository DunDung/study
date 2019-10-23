import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  //data 저장 역할
  state: {
    allUsers:[
      {userId: 'hoza123', password: '123', name: 'Hoza', address: 'Seoul', src:'https://goo.gl/oqLfJR'},
      {userId: 'max123', password: '456', name: 'Max', address: 'Berlin', src:'https://goo.gl/Ksk9B9'},
      {userId: 'lego123', password: '789', name: 'Lego', address: 'Busan', src:'https://goo.gl/x7SpCD'}
    ]
  },
  //computed와 같은 역할
  getters: {
    //allUsersCount: state => { 이렇게 쓸 수도 있다
    allUsersCount: function(state) {
      return state.allUsers.length
    },
    countOfSeoul: state => {
      let count = 0;
      state.allUsers.forEach(user => {
        if(user.address === 'Seoul') count++;
      })
      return count
    },
    percentOfSeoul: (state, getters) => {
      return Math.round(getters.countOfSeoul / getters.allUsersCount * 100)
    }
  }
  //state값 변화시키는 역할 동기로 동작하기 때문에 state를 변화시키는 것은 mutations
  mutations: {
    //payload는 받은(넘어온) 값을 저장할 곳
    addUsers: (state, payload) => {
      state.allUsers.push(payload)
    }
  },
  actions: { //mutations을 동작시키는 비즈니스로직을 actions에 넣어준다.
    addUsers: ({ commit }, payload) => {
      //원래는 context, payload를 사용해서  context.commit을 해야하지만
      //간단하게 사용하기 위해 { commit }, payload를 하고 commit을 바로 한다.
      commit('addUsers')
    }
  }
})
