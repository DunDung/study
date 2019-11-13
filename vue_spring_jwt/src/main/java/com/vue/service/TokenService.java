package com.vue.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vue.config.JwtTokenProvider;
import com.vue.domain.User;
import com.vue.dto.TokenKinds;
import com.vue.repository.UserRepository;

@Service
public class TokenService {

	@Autowired
	UserRepository userRepo;
	
	@Autowired
	JwtTokenProvider jtp;
	
	public String checkToken(HttpServletResponse response, HttpServletRequest request, String beforeToken) {
		
		String token = null;
		
		if(beforeToken != null) {
			
			String checkValid = jtp.validateToken(beforeToken);
			
			// access 토큰이 만료되었을 경우
			if(checkValid == "expiredTokenDate") {
				String id = request.getHeader("User");
				User user = userRepo.findByUserId(id);
				
				// refresh 토큰이 만료되었을 경우 로그아웃 처리 후 admin 컨트롤러로 못하게 방지
				String boolRefreshToken = jtp.validateToken(user.getUserToken());
				if(boolRefreshToken == "expiredTokenDate") {
					response.setHeader("TokenValid", "expire");
					
					// 만료된 토큰일 경우 refresh 토큰도 없애기
					user.setUserToken(null);
					userRepo.save(user);

				// access token 만료 and refresh token active 
				} else if(boolRefreshToken == "success") {
					// 재갱신
					TokenKinds tokenKinds = jtp.createToken(user);
					user.setUserToken(tokenKinds.getRefreshToken());
					userRepo.save(user);
					response.setHeader("TokenValid", "refresh");
					response.setHeader("Authorization", tokenKinds.getAccessToken());
					
					token = tokenKinds.getAccessToken();
				}
			// 사용가능한 access token일 경우
			} else if(checkValid == "success") {
				token = beforeToken;
			}
		} // if
		return token;
	} // checkToken
}
