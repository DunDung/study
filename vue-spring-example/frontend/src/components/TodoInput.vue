<template>
  <div>
    <input type="text" v-model="newTodoItem">
    <button v-on:click="addTodo">추가</button>
  </div>
</template>

<script>
export default {
  data () {
    return {
      newTodoItem: ''
    }
  },
  methods: {
    addTodo () {
      var a = this.newTodoItem
      this.$http.get('/todo/addTodo/' + a).then().catch()
    }
  }
}
</script>

<style>

</style>
