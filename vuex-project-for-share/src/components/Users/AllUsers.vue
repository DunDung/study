<template>
  <div>
    <h1>All Users({{ allUsersCount }})</h1>
    <h3>Seoul Users{{ countOfSeoul }} ({{ percentOfSeoul }})</h3>
    <v-list two-line>
      <!--store에서 불러오기 -->
      <v-list-tile
        v-for="(user, index) in allUsers"
        :key="index"
        avatar
      >
        <v-list-tile-avatar color="grey lighten-3">
          <img :src="user.src">
        </v-list-tile-avatar>

        <v-list-tile-content>
          <v-list-tile-title v-html="user.name"></v-list-tile-title>
          <v-list-tile-sub-title>id:#{{index}} / {{user.address}} 거주</v-list-tile-sub-title>
        </v-list-tile-content>
      </v-list-tile>
    </v-list>

  </div>
</template>

<script>
import { EventBus } from '@/main.js'
import {mapState, mapGetters } from 'vuex' //mapGetters, mapState 객체로 받아와서 사용하기

  export default {
    data() {
      return {

      }
    },
    computed: { //mapGetters, mapState 사용하기, 뮤테이션, 액션스도 가능ㅌ
      ...mapGetters(['allUsersCount', 'countOfSeoul', 'percentOfSeoul']) //불러와야지만 사용가능함
      //객체로 선언해서 이름바꾸어서도 사용가능하다.
      // ...mapGetters({
      //   count: 'allUsersCount',
      //   seouls: 'countOfSeoul',
      //   percent: 'percentOfSeoul'
      // })
      ...mapState(['allUsers'])

    },
    mounted() {
      EventBus.$on('signUp', users => {
        this.$store.state.allUsers.push(users) //vuex에서 불러오기
      })
    }
  }
</script>
