import Vue from 'vue'
import Vuex from 'vuex'
import axios from 'axios'
import qs from 'qs'
import VueLocalStorage from 'vue-localstorage'
import jwt_decode from 'jwt-decode'

Vue.use(Vuex);
Vue.use(VueLocalStorage);


export const store = new Vuex.Store({

    el: '#test',
    // state 등록
    state: {
        counter: 0,
        accessToken: Vue.localStorage.get("accessToken"), 
        role: Vue.localStorage.get("role")
    },

    // getters 등록
    getters: {
        getCounter: function (state) {
            return state.counter;
        },
        getToken: function(state) {
            return state.accessToken;
        }
    },

    mutations: {
        addCounter: function(state, payload){
            return state.counter++;
        },
        increment: function(state, payload){
            state.counter = state.counter + payload
            return state.counter
        },
        LOGIN: function(state, payload) {
            Vue.localStorage.set('accessToken', payload);
            state.accessToken = payload
        },
        LOGOUT: function(state) {
            Vue.localStorage.remove("accessToken");
            state.accessToken = null
        }
    },  
    actions: {
        asyncIncrement: function(context, payload) {
            return setTimeout(function() {
                context.commit('increment', payload.by)
            }, 0)
        },
        LOGIN: function(context, payload) {
            // 이미 로그인 정보가 존재할 경우 logout 실행 후 로그인
            var before_token = Vue.localStorage.get('accessToken');
            if(before_token != null) {
                Vue.localStorage.remove('accessToken');
                context.dispatch('LOGOUT');
            }
            return axios({
                method: 'post',
                url: 'api/request/login',
                data: qs.stringify(payload),
            }).then( (result) => { 
                
                var auth = result.headers.authorization;
                // 로그인 실패
                if(auth == undefined){
                    alert("존재하지않는 정보 입니다.");
                // 로그인 성공
                } else {
                    const token = auth.split('Bearer ')[1];
                    context.commit('LOGIN', token);

                    // 모든 HTTP 요청 헤더에 Authorization 을 추가한다.
                    axios.defaults.headers.common['Authorization'] = 'Bearer ${result.accessToken}';
                    
                }  
            }) // then
            
        }, // LOGIN
        LOGOUT: function(context){
            var token = this.getters.getToken
            var decodeToken = jwt_decode(token)
            
            if(token != null) {
                axios({
                    method: 'get',
                    url: 'api/request/logout/user/'+decodeToken.sub,
                }).then( () => {
                    Vue.localStorage.remove('accessToken');
                    context.commit('LOGOUT');
                })
            } // if

        } // LOGOUT
        
    } // actions
})