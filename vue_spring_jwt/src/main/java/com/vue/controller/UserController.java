/**
 * 
 */
package com.vue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vue.config.JwtTokenProvider;

import lombok.extern.slf4j.Slf4j;

/**
 * @author HIGH
 *
 */
@RestController
@RequestMapping("user")
@Slf4j
public class UserController {
	
	@Autowired
	JwtTokenProvider jtp;
	
	@GetMapping("detail/{user}")
	public void detailUser(@PathVariable("user") String id, @RequestHeader("Authorization") String token) {
		log.info("user 입니다.");
	}
}
