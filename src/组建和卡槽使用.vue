<!--
  Vue 组建：component
    1）组建内部获取传递的数据
      A、在子组建中定义：props:["属性名称"]
      B、在父级中import 组建名称 from "组建地址"
      C、在父级中components属性中使用组建
         components:{mytable}
      D、<mytable v-bind:子组建中的props名称="需要传递的数据>
         </mytable>

    2）组建内部传递数据到外部组建：
        A、this.$emit("remove",item); 调用自定义函数
            item：传递数据，多个用逗号隔开
        B、在使用组建的位置声明自定义事件
            <mytable @update="update"

    3）卡槽：组建内部中需要个性效果定义
        默认卡槽、命名卡槽、作用域卡槽
        <slot></slot>

        注意：slot在2.1.6中写法发生改变，v-slot
          替换原有 slot属性和slotScope属性

        命名卡槽/作用域卡槽：
          组建内部：<slot name="名称" :名称="传递值"></slot>
          组建外部：<template v-slot:名称="传递过来的值">

  路由：
    
-->
<template>
  <div id="app">1111
    <mytable @update="update" @remove="remove" v-bind:list="list">
        <template v-slot:header="a">
          <div style="color:red">牛逼的一踏糊涂{{a}}</div>
        </template>
        <template v-slot:footer>这是尾部</template>
    </mytable>
    <mytable @update="update" @remove="remove" v-bind:list="list">
        <template v-slot:header>
          <div style="color:red">牛逼的一踏糊涂</div>
        </template>
        <template v-slot:footer>这是尾部</template>
    </mytable>
  </div>
</template>

<script>
import mytable from "@/components/Table"
export default {
  name: 'App',
  components:{
    mytable
  },
  data(){
    return {
      list:[
        {id:1,name:"皮蛋",age:18},
        {id:2,name:"够蛋",age:19}
      ]
    }
  },methods:{
    update(item){
      console.log(item);
    },
    remove(item){
      console.log(item);
    }
  }
}
</script>

<style>

</style>
