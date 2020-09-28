
<template>
<div class="login-page">
  	<div class="login-box">
        <div class="logo">
            <a>Office<b></b></a>
        </div>
        <div class="card">
            <div class="body">
                <div class="msg">로그인 페이지</div>
                
                <div class="input-group">
                    <span class="input-group-addon">
                        <i class="material-icons">person</i>
                    </span>
                    <div class="form-line">
                        <input type="text" class="form-control" v-model="id" placeholder="Username" required autofocus>
                    </div>
                </div>
                
                <div class="input-group">
                    <span class="input-group-addon">
                        <i class="material-icons">lock</i>
                    </span>
                    <div class="form-line">
                        <input type="password" class="form-control" v-model.trim="pw" placeholder="Password" required>
                    </div>
                </div>
                <div class="row">
                    <div class="col-xs-8 p-t-5">
                    </div>
                    <div class="col-xs-4">
                        <div class="btn btn-block bg-pink waves-effect" @click="loginBtn">로그인</div>
                    </div>
                    <div class="col-xs-4">
                        <div class="btn btn-block bg-pink waves-effect" @click="logoutBtn">로그아웃</div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</template>

<script>
import $ from 'jquery';
import axios from 'axios';
import qs from 'qs';
import { mapGetters } from 'vuex';

export default {
	
	name: 'Test',
	data () {
		return {
			id: '',
			pw: '',
		}
	},
	computed: {
		...mapGetters([
			'getToken'		
		]),
	},
	
	methods: {
		loginBtn: function() {

			var id = this.id;
			var pw = this.pw;

			this.$store.dispatch('LOGIN', {id, pw})
			// this.$router.push('/')
		}, 
		logoutBtn: function() {
			this.$store.dispatch('LOGOUT')
			// this.$router.push('/')
		},
	},
}
</script>

<style>
  @import "../../css/style.css";
  @import "../../css/fontsgoogleapiscom1.css";
  body {background-color: #00BCD4};
</style>