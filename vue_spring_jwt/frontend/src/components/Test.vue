<!--
<template>
  <div class="test">
    <h1>zzzzzzzzzzzzzz</h1>
    <button v-on:click="validTest">test</button>
    <button class="btn btn-primary">Button</button>
  </div>
</template>
-->

<template>
  <body class="login-page">
    <div class="login-box">
        <div class="logo">
            <a>Office<b></b></a>
        </div>
        <div class="card">
            <div class="body">
                <form id="offLoginForm" method="POST">
                    <div class="msg">Sign in to start your session</div>
                    <div class="input-group">
                        <span class="input-group-addon">
                            <i class="material-icons">person</i>
                        </span>
                        <div class="form-line">
                            <input type="text" class="form-control" name="OfficeID" placeholder="Username" required autofocus>
                        </div>
                    </div>
                    <div class="input-group">
                        <span class="input-group-addon">
                            <i class="material-icons">lock</i>
                        </span>
                        <div class="form-line">
                            <input type="password" class="form-control" name="OfficePW" placeholder="Password" required>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-xs-8 p-t-5">
                        </div>
                        <div class="col-xs-4">
                            <div class="btn btn-block bg-pink waves-effect" id="btnLogin">SIGN IN</div>
                        </div>
                    </div>
                <input name="__RequestVerificationToken" type="hidden" value="CfDJ8KnINimtp7ZIioJWfC5tGYgVwMCsG9ttGeG6Io072Z7TK8ESOIifixi8idhdKaVejjyf6MTNAfcvu08eDxTRAAThODYgWYmYv7s_AA6ovzRbgNBkEXE798rE042--D6T9_HRVZGj52BrKUXdMpw-ee4" /></form>
            </div>
        </div>
    </div>
</body>
</template>
<style>
  @import "../../css/style.css";
  @import "../../css/fontsgoogleapiscom1.css";
  /* @import "../../css/bootstrap.css"; */
  
  body {background-color: #00BCD4};
</style>
<script>
import axios from 'axios';
import { mapGetters } from 'vuex';
import jwt_decode from 'jwt-decode';

export default {
  name: 'Test',
  data () {
    return {
      msg: 'Test Message'
    }
  },
  computed: {
		...mapGetters([
			'getToken'		
		]),
	},
  methods: {
    validTest: function () {
      
      var token = this.getToken;
      var decodeToken = jwt_decode(token);
      if(token != null) {
        axios({
          method: 'get',
          url: 'api/user/detail/'+decodeToken.sub,
          headers: {
            'Authorization': 'Bearer '+token,
            'user': decodeToken.sub
          }
        }).then( (result) => {
          console.log(result)
        })
      } else {
        alert("로그인 후 사용 가능 합니다.");
      }
      
      
    }
  } // methods
}
</script>



<!--
function parseJwt (token) {
    var base64Url = token.split('.')[1];
    var base64 = base64Url.replace(/-/g, '+').replace(/_/g, '/');
    var jsonPayload = decodeURIComponent(atob(base64).split('').map(function(c) {
        return '%' + ('00' + c.charCodeAt(0).toString(16)).slice(-2);
    }).join(''));

    return JSON.parse(jsonPayload);
};
import $ from 'jquery'
$(document).ready(function(){
  var token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ0ZXN0IiwibmFtZSI6Iu2FjOyKpO2KuCIsInJvbGUiOiJ1c2VyIiwiaWF0IjoxNTY1MzM3MDYwLCJleHAiOjE1NjUzNDA2NjB9.R88s23LsCkW9K5qB0hilyZjgr9ylR83OWCiEvGYy-gU"

  console.log(parseJwt(token));
})
-->


