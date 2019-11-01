<template>
  <div>
    <!--서버와 통신할 때 패스워드는 넘겨와서 vuex에서 사용하거나 하면 안된다. -->
    <h1>{{ userInfo.first_name }}  {{userInfo.last_name}}환영합니다.</h1>
  </div>
</template>

<script>
import { mapState } from 'vuex'

export default {
  computed: {
    ...mapState(['userInfo'])
  }
}
</script>
