// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import axios from 'axios'

// bootstrap
import 'bootstrap/dist/css/bootstrap.css'
// import 'bootstrap-vue/dist/bootstrap-vue.css'


// require('../css/style.css')

// store.js
import { store } from './store/store'

Vue.prototype.$http = axios
Vue.config.productionTip = false


/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  
  // store.js 등록
  store,
  render: h => h(App)
})
/*
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
*/