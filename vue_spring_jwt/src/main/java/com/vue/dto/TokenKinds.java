/**
 * 
 */
package com.vue.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author HIGH
 *
 */
@Getter
@Setter
public class TokenKinds {
	
	private String accessToken;
	private String refreshToken;
	private String tokenType;
}
