<!-- props demo -->
<!--
<template>
  <div class="child">
    <hr>
    Child counter : {{passedCounter}}<br>
    <button>+</button>
    <button>-</button>
  </div>
</template>

<script>
export default {
  props: ['passedCounter']
}
</script>
-->

<template>
  <div class="child">
    <hr>
    <!-- Child counter : {{this.$store.state.counter}}<br> -->
    <!-- 간소화 코드 -->
    Child counter : {{ childCounter }}<br>
    <button>+</button>
    <button>-</button>
  </div>
</template>

<script>
export default {
  // Child.vue
  computed: {
    childCounter() {
      // return this.$store.state.counter;
      // getters를 사용한 방식
      return this.$store.getters.getCounter;
    }
  },
}
</script>