import Vue from 'vue'
import VueRouter from 'vue-router'
import store from '../store'

Vue.use(VueRouter)

const rejectAuthUser = (to, from, next) => {
  if(store.state.isLogin === true) {
    //이미 로그인된 유저
    alert('이미 로그인하였습니다.')
    next("/")
  } else {
    next()
  }
}
const onlyAuthUser = (to, from, next) => {
  if(store.state.isLogin === false) {
    //아직 로그인 안된 유저
    alert('로그인이 필요합니다.')
    next("/")
  } else {
    next()
  }
}
const routes = [
  {
    path: '/',
    name: 'home',
    component: () => import(/* webpackChunkName: "about" */ '../views/Home.vue')
  },
  {
    path: '/login',
    name: 'login',
    //라우터 이동전에 작동시킨다. 가드역할
    beforeEnter: rejectAuthUser,
    component: () => import(/* webpackChunkName: "about" */ '../views/Login.vue')
  },
  {
    path: '/mypage',
    name: 'mypage',
    beforeEnter: onlyAuthUser,
    component: () => import(/* webpackChunkName: "about" */ '../views/MyPage.vue')
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
