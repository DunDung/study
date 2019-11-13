/**
 * 
 */
package com.vue.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vue.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * @author HIGH
 *
 */
@RequestMapping("admin")
@RestController
@Slf4j
public class AdminController {

	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/")
	public void index(@RequestHeader(value="Authorization") String authorization) {
		log.info(authorization);
		log.info("##############################################");
	}

	
	@GetMapping("test")
	public void test(@RequestHeader(value="Authorization") String authorization) {
		log.info(authorization);
		log.info("##############################################");
	}
	
}
