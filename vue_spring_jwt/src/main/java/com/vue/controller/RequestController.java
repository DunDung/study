/**
 * 
 */
package com.vue.controller;


import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vue.config.JwtTokenProvider;
import com.vue.domain.User;
import com.vue.dto.TokenKinds;
import com.vue.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * @author HIGH
 *
 */
@RequestMapping("request")
@RestController
@Slf4j
public class RequestController {

	@Autowired
	UserRepository userRepo;
	
	@Autowired
	JwtTokenProvider jtp;
	
	@PostMapping(value="login")
	public void login(@RequestParam("id") String id, @RequestParam("pw") String pw, HttpServletResponse response) {
		
		log.info("로그인 요청");
		
		User m = userRepo.findByUserIdAndUserPw(id, pw);
		if(m != null) {
			TokenKinds tokenKinds = jtp.createToken(m);
			response.addHeader("Authorization", "Bearer "+tokenKinds.getAccessToken());
			m.setUserToken(tokenKinds.getRefreshToken());
			userRepo.save(m);
		}
	}
	
	@GetMapping(value="logout/user/{user}")
	public void logout(@PathVariable("user") String id) {
		User user = userRepo.findByUserId(id);
		user.setUserToken(null);
		userRepo.save(user);
	}

	@GetMapping("test")
	public void validateTest(@RequestHeader(value="Authorization") String token) {
		
		// String splitToken = token.split("Bearer ")[1];
		
		// if(jtp.validateToken(splitToken) == "expiredTokenDate") {}
		
		
	}
}
