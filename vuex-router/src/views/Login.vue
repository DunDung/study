<template>
  <v-container fill-height style="max-width:460px">
    <v-layout align-center row wrap>
      <v-flex xs12>
        <v-alert
          class="mb-3"
          :value=isLoginError
          type="error"
          >
          아이디와 비밀번호를 확인해주세요.
        </v-alert>
        <v-alert
          class="mb-3"
          :value=isLogin
          type="success"
          >
          로그인이 완료되었습니다.
        </v-alert>
        <v-card>
          <v-toolbar flat>
            <v-toolbar-title>로그인</v-toolbar-title>
          </v-toolbar>
          <div class="pa-3">
            <v-text-field
                v-model="email"
                label="이메일을 입력하세요."
                ></v-text-field>
              <v-text-field
                v-model="password"
                type="password"
                label="패스워드를 입력하세요."
                ></v-text-field>
                <v-btn
                  color="primary"
                  depressed
                  large
                  block
                  @click="login({email, password})"
                >로그인</v-btn>
                <!--
                <v-btn @click="test">테스트</v-btn>
                <v-btn @click="postTest">포스트테스트</v-btn>
                -->
              </div>
          </v-card>
       </v-flex>
    </v-layout>
  </v-container>
</template>
<script>
  import { mapState, mapActions } from 'vuex'
  export default {
    data () {
      return {
        email: null,
        password: null,
      }
    },
    computed: {
      ...mapState(["isLogin", "isLoginError"])
    },
    methods: {
      ...mapActions(["login"]),
      // test() {
      //   axios
      //     .get("https://reqres.in/api/users?page=2")
      //     .then(res => { //function으로 하면 메소드 내부를 가리키기 때문에 에로우 펑션으로 전체 인스턴스를 가리켜야한다.
      //       console.log(res)
      //     })
      //     .catch(err => {
      //       console.log(err)
      //     })
      //     .then(() => {
      //       //항상 반환
      //       console.log('test')
      //     })
      //   },
      //   postTest() {
      //     //post는 object를 body에 담아서 보냄
      //     axios
      //     .post("https://reqres.in/api/register", {
      //       "email": "eve.holt@reqres.in",
      //       "password": "pistol"
      //     })
      //     .then(res => { //function으로 하면 메소드 내부를 가리키기 때문에 에로우 펑션으로 전체 인스턴스를 가리켜야한다.
      //       console.log(res)
      //     })
      //     .catch(err => {
      //       console.log(err)
      //     })
      //     .then(() => {
      //       //항상 반환
      //       console.log('postTest')
      //     })
      //   }
      }
    }
</script>
