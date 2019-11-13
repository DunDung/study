import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import Test from '@/components/Test'
import Login from '@/components/Login'
import Admin from '@/components/Admin'
import jwt_decode from 'jwt-decode'
import { store } from '../store/store'
import axios from 'axios';


/*
1. access 토큰이 만료되지 않았을 경우
2. access 토큰이 만료되었지만 refresh 토큰은 만료되지 않았을 경우
3. 둘 다 만료되었을 경우 (이 경우 다시 로그인 유도)
*/
const requireAuth = () => (to, from, next) => {

	var token = store.getters.getToken;

	// access token이 있을 경우 axios 실행
	if(token != null) {
		
		var user = jwt_decode(token);
		var user_role = user.role;

		// 토큰의 접근권한 확인
		if(user_role == 'admin') {
			
			// admin일 경우 accessToken의 접근권한

			axios({
				method: 'get',
				url: 'api/admin/test',
				// 로그인 후 서버로 요청을 보낼 시 header에 자동으로 토큰 보내는 방법 찾아보기
				headers: {
					'Authorization': 'Bearer '+token,
					'User': user.sub
				}
			}).then((result) => {
				var tokenValid = result.headers.tokenvalid;
				// 둘 다 만료되었을 경우 (이 경우 다시 로그인 유도)
				if(tokenValid == "expire") {
					next('/login');
					alert("토큰기간 만료");

				// access 토큰이 만료되었지만 refresh 토큰은 만료되지 않았을 경우(access 토큰 재갱신)
				} else if(tokenValid == "refresh") {
					store.commit('LOGIN', result.headers.authorization);
				}
			}).catch(() => {})
			return next();
		} 
	} else if(token == null) {
		alert('로그아웃 상태 입니다.')
	} else {
		alert('관리자 계정이 아닙니다.')
	} // if
	
	next('/login')
};
  
Vue.use(Router)

const NotPage = { template: '<div>Not Found</div>' }
export default new Router({
	mode: 'history',

	routes: [
		{ path: '/', name: 'HelloWorld', component: HelloWorld },
		{ path: '/test', name: 'Test', component: Test },
		{ path: '/login', name: 'Login', component: Login },
		{ path: '/admin', name: 'Admin', component: Admin, beforeEnter: requireAuth() },
		{ path: '*', name: 'NotPage', component: NotPage },
	]
})
