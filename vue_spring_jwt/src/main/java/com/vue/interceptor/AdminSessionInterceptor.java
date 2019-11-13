/**
 * 
 */
package com.vue.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.vue.config.JwtTokenProvider;
import com.vue.service.TokenService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author pc10
 *
 */

@Slf4j
public class AdminSessionInterceptor implements HandlerInterceptor {
	
	@Autowired
	private TokenService tokenService;
	
	@Autowired
	private JwtTokenProvider jtp;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		boolean flag = false;
		
		log.info("preHandle");

		String token = request.getHeader("Authorization").split("Bearer ")[1];
		
		// check == true ? 사용가능한 토큰 : 사용 불가능한 토큰 
		String returnToken = tokenService.checkToken(response, request, token);
		
		
		if(returnToken == null) {
			flag = false;
		
		// 사용가능한 토큰의 접근 권한이 admin인지 확인하는 부분 
		} else {
			flag = (jtp.getUserRole(returnToken) == "admin") ?  true : false;
		}
	    return flag;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
	
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
	
	}
}
