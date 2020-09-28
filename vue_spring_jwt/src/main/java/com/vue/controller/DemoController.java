/**
 * 
 */
package com.vue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author HIGH
 *
 */

@Controller
public class DemoController {

	@RequestMapping("login")
	public String login(Model model, String error, String logout) {
		if(error != null) {
			model.addAttribute("errorMsg", "Your username and password are invalid.");
		}
		if(logout != null) {
			model.addAttribute("msg", "You have been logged out successfully");
		}
		return "login.html";
	}
}
