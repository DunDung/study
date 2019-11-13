/**
 * 
 */
package com.vue.config;

import java.util.Base64;
import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.vue.domain.User;
import com.vue.dto.TokenKinds;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;



/**
 * @author HIGH
 *
 */
@RequiredArgsConstructor
@Component
@Slf4j
public class JwtTokenProvider {

	@Value("spring.jwt.secret")
	private String secretKey;
	
	// private String sort = "dasdasdasdasdawjf9es-fjes0ghrgergjh9-weh";
	
	private long accessTokenValidMilisecond = 1000L * 1 * 1; // 1시간만 토큰 유효
	private long refreshTokenValidMilisecond = 1000L * 60 * 60; // 1시간만 토큰 유효
	// private long refreshTokenValidMilisecond = 1000L * 1 * 1; // 1시간만 토큰 유효
	
	@PostConstruct
    protected void init() {
        secretKey = Base64.getEncoder().encodeToString(secretKey.getBytes());
    }
	
	
    // JWT 토큰 생성 
	public TokenKinds createToken(User user) {
		
		String role = user.getRole(user.getRoles());
		
    	Claims claims = Jwts.claims().setSubject(user.getUserId());
    	claims.put("name", user.getUserName());
        claims.put("role", role);
        
        
        Date now = new Date();
        
        
        String accessToken = Jwts.builder().
			        		setHeaderParam("typ", "JWT").
			        		setClaims(claims).		 // 데이터
			        		setIssuedAt(now).		 // 토큰 발행일자
			        		setExpiration(new Date(now.getTime() + accessTokenValidMilisecond)).		// set Expire Time
			        		signWith(SignatureAlgorithm.HS256, secretKey).						// 암호화 알고리즘, secret값 세팅
			        		compact();
        
        claims.put("pw", user.getUserPw());
        
        String refreshToken = Jwts.builder().
			        		setHeaderParam("typ", "JWT").
			        		setClaims(claims).		 // 데이터
			        		setIssuedAt(now).		 // 토큰 발행일자
			        		setExpiration(new Date(now.getTime() + refreshTokenValidMilisecond)).		// set Expire Time
			        		signWith(SignatureAlgorithm.HS256, secretKey).						// 암호화 알고리즘, secret값 세팅
			        		compact();

	TokenKinds tokenKinds = new TokenKinds();
   
        tokenKinds.setAccessToken(accessToken);
        tokenKinds.setRefreshToken(refreshToken);
        
        return tokenKinds;
    }
    
    // Jwt 토큰에서 회원 구별 정보 추출
    public String getUserPk(String token) {
        return Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody().getSubject();
    }
    
    // Jwt 토큰에서 회원 구별 정보 추출
    public String getUserRole(String token) {
        return (String) Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody().get("role");
    }
    	
    // Jwt 토큰의 유효성 + 만료일자 확인
    public String validateToken(String token) {
    	String msg = "";
    	
    	if(token == null) {
    		msg = "not token";
    	} else {
    		try {
        		Jws<Claims> claims = Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token);
        		if(!claims.getBody().getExpiration().before(new Date())) {
        			msg = "success";
        		}	
        	} catch (ExpiredJwtException e) {
    			msg = "expiredTokenDate";	// 토큰 만료
    			log.error("토큰 만료");
    		} catch (SignatureException e) {
    			msg = "wrongSign";			// 토큰의 서명 검증이 위조되거나 문제가 생긴 경우
    		} catch (Exception e) {
        		msg = "error";
    		}
    	} // if
    	
    	
    	return msg;
    }
} //class


