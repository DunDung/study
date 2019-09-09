import Vue from 'vue'
import Router from 'vue-router'
import Read from '@/components/Read'
import Create from '@/components/Create'
import Detail from '@/components/Detail'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Read',
      component: Read
    },
    {
      path: '/create/:contentId?', //?가 있을경우 파라미터가 없어도 보여주고 있어도 보여준다.
      name: 'Create',
      component: Create
    },
    {
      path: '/detail/:contentId',
      name: 'Detail',
      component: Detail
    },
  ]
})
