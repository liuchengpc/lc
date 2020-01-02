import Vue from 'vue'
import Router from 'vue-router'
import Index from '@/views/Index'
import Page1 from '@/views/Page1'
import Page2 from '@/views/Page2'
import Page3 from '@/views/Page3'
Vue.use(Router)

export default new Router({
    mode:'history',
  routes: [
    {
      path:'/',
      name:"/",
      component:Index,
      children:[
        {
            path:'/goods',
            name:"/goods",
            component:Page1
        },
        {
            path:'/stu',
            name:"/stu",
            component:Page2
        },{
            path:'/stu2',
            name:"/stu2",
            component:Page3
        }
      ]
    }
  ]
})
