<!--  -->
<template>
  <div class="index">
    <div>
        <el-button type="danger">红色</el-button>
    </div>
    <div>
        <ul>
            <li @click="toPage('/goods')">商品管理</li>
            <li @click="toPage('/stu')">学生管理</li>
            <li @click="toPage('/stu2')">订单管理</li>
        </ul>
    </div>
    <div><router-view></router-view></div>
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
    return {};
  },
  //监听属性 类似于data概念
  computed: {},
  //监控data中的数据变化
  watch: {},
  //方法集合
  methods: {
      toPage(path){
          this.$router.push({path:path,query:{}});
      }
  },
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
    .index{
        display: flex;
    }
    .index>div{
        border:1px solid red;
        flex-grow: 1
    }
</style>