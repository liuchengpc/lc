<!--  -->
<template>
  <div class>
      <slot name="header" :msg="msg" :tempname="name"></slot>
      <table>
          <tr>
              <td>
                  编号
              </td>
              <td>
                  姓名
              </td>
              <td>
                  年龄
              </td>
              <td>
                  操作
              </td>
          </tr>
          
          <tr :key="item.id" v-for="item in list">
              <td>
                  {{item.id}}
              </td>
              <td>
                  {{item.name}}
              </td>
              <td>
                  {{item.age}}
              </td>
              <td>
                  <span @click="remove(item)">删除</span>
                  <span @click="update(item)">修改</span>
              </td>
          </tr>
      </table>
      <slot name="footer"></slot>
  </div>
</template>

<script>
//这里可以导入其他文件（比如：组件，工具js，第三方插件js，json文件，图片文件等等）
//例如：import 《组件名称》 from '《组件路径》';

export default {
  props:["list"],
  //import引入的组件需要注入到对象中才能使用
  components: {},
  data() {
    //这里存放数据
    return {
        msg:"这是一个漂亮头部",
        name:"这是一个漂亮名字"
    };
  },
  //监听属性 类似于data概念
  computed: {},
  //监控data中的数据变化
  watch: {},
  //方法集合
  methods: {
      remove(item){
          this.$emit("remove",item);
      },
      update(item){
          this.$emit("update",item);

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
</style>