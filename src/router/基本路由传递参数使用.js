import Vue from 'vue'
import Router from 'vue-router'
import Page1 from '@/views/Page1'
import Page2 from '@/views/Page2'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path:'/',
      name:"/",
      component:null
    },
    {
      path:'/page1',
      name:"page1",
      component:Page1
    },
    {
      path:'/page2',
      name:"page2",
      component:Page2
    }
  ]
})
