<!-- 
    路由：
        1）router-view:显示组建
        2）router-link:路由跳转

        3）路由地址配置：
            {
                path:"/定义路由路径",
                name:"定义路由名称",
                component:定义路由显示的组建,
                children:[]//定义子路由内容
            }
        4）路由传递参数：
            A、<router-link :to="{path:'/page1',query:{id:id}}">去第一个页面</router-link>
            B、{{$route.query.id}}

            C、<router-link :to="{name:'page2',params:{id:id}}">去第二个页面</router-link>

            注意：path与query对应，name与params对应

            通过js进行路由跳转：
            this.$router.push({path:path,query:{}});
            去除地址栏中#号：mode:'history',
        5）子路由：

        6）样式：scoped 加上后表示在本组建中使用，不加则会影响整个网页
        7）安装element ui
            import ElementUI from 'element-ui'
            import 'element-ui/lib/theme-chalk/index.css'
            Vue.use(ElementUI);
 -->  
<template>
  <div class>
      这是最外层显示的内容.
      <router-link :to="{path:'/page1',query:{id:id}}">去第一个页面</router-link>
      <router-link :to="{name:'page2',params:{id:id}}">去第二个页面</router-link>
      <router-view></router-view>
  </div>
</template>

<script>
//这里可以导入其他文件（比如：组件，工具js，第三方插件js，json文件，图片文件等等）
//例如：import 《组件名称》 from '《组件路径》';

export default {
  //import引入的组件需要注入到对象中才能使用
  components: {},
  data() {
    //这里存放数据
    return {
        id:1
    };
  },
  //监听属性 类似于data概念
  computed: {},
  //监控data中的数据变化
  watch: {},
  //方法集合
  methods: {},
  //生命周期 - 创建完成（可以访问当前this实例）
  created() {},
  //生命周期 - 挂载完成（可以访问DOM元素）
  mounted() {},
  beforeCreate() {}, //生命周期 - 创建之前
  beforeMount() {}, //生命周期 - 挂载之前
  beforeUpdate() {}, //生命周期 - 更新之前
  updated() {}, //生命周期 - 更新之后
  beforeDestroy() {}, //生命周期 - 销毁之前
  destroyed() {}, //生命周期 - 销毁完成
  activated() {} //如果页面有keep-alive缓存功能，这个函数会触发
};
</script>
<style scoped>
</style>