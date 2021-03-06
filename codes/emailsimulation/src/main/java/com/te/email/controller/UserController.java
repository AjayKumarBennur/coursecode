package com.te.email.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.te.email.dto.UserInfo;
import com.te.email.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService service;

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/register")
	public String register() {
		return "register";
	}

	@PostMapping("/login")
	public String dologin(UserInfo obj, HttpServletResponse res) {
		boolean validate = service.validate(obj);
		if (validate) {
			Cookie cookie = new Cookie("name", obj.getUsername());
			res.addCookie(cookie);
			return "welcome";
		}
		return "failure";
	}

	@PostMapping("/register")
	public String doregister(UserInfo user, ModelMap map) {
		boolean save = service.save(user);
		if (save) {
			map.addAttribute("name", user.getUsername());
			return "success";
		}
		return "failure";
	}

	@GetMapping("/inbox")
	public String getInbox(@CookieValue String name, ModelMap map) {
		map.addAttribute("data", name);
		return "inbox";
	}

}
