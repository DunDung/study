<!-- base App.vue -->

<template> 
  <div id="app">
    <!-- <img src="./assets/logo.png"> -->
    <router-view/>
  </div>
</template>



<!-- props로 컴포넌트 간의 데이터 전달 방식 -->
<!--
<template>
  <div id="app">
    Parent counter : {{counter}}<br>
    <button @click="addCounter">+</button>
    <button @click="subCounter">-</button>

    <child v-bind:passedCounter="counter"></child>
  </div>
</template>

<script>
import Child from './components/Child'

export default {
  data() {
    return {
      // data 속성
      counter: 0
    }
  },
  methods: {
    // 이벤트 추가
    addCounter() {
      this.counter++;
    },
    subCounter() {
      this.counter--;
    }
  },
  components: {
    'child': Child
  }
}
</script>
-->


<!-- Vuex demo start(1) -->
<!--
<template>
  <div id="app">

    Parent counter : {{ parentCounter }}<br>
    mapGetters counter : {{ getCounter }}<br>
    <button @click="addCounter">+</button>
    <button @click="subCounter">-</button>
    <child></child>


    <button @click="asyncIncrement({ by:50, duration: 500 })">Increment</button>
  </div>
</template>

<script>
import Child from './components/Child'

// mapGetters
import { mapGetters } from 'vuex'

// mapAction
import {mapActions} from 'vuex';

export default {
  /*
  computed: mapGetters([
    'getCounter'
  ]),
  */

 computed:{
   ...mapGetters([
     'getCounter'
   ]),
   parentCounter() {

      // state 접근 방식
      // return this.$store.state.counter;
      
      // getters를 사용한 방식
      return this.$store.getters.getCounter;
   }
 },

  /*
  // App.vue
  computed: {
    parentCounter() {
      // state 접근 방식
      // return this.$store.state.counter;
      
      // getters를 사용한 방식
      return this.$store.getters.getCounter;
    }
  },
  */
  methods: {
    
    
    addCounter() {
      // 컴포넌트에 직접 접근하여 증가시키는 방법
      // this.$store.state.counter++;

      this.$store.commit('addCounter');
    },
    subCounter() {
      this.$store.state.counter--;
    },

    ...mapActions([
      'asyncIncrement'
    ]),
  },
  components: {
    'child': Child
  }
}
</script>
-->
<!--
<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
-->