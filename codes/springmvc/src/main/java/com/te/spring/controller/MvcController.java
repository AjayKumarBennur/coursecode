package com.te.spring.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.te.spring.dao.DaoLayer;
import com.te.spring.dto.LoginModel;
import com.te.spring.dto.RegisterModel;

@Controller
public class MvcController {

	@Autowired
	DaoLayer dao;

	@GetMapping(path = "/home")
	public String homepage() {
		return "home";
	}

	@GetMapping(path = "/login")
	public String loginpage() {
		return "login";
	}

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute LoginModel login,HttpServletResponse res) {
		System.out.println(login);
		if (login.getUsername().isEmpty()) {
			return "failure";
		}
		boolean validate = dao.validate(login);
		if (validate) {
			Cookie cookie= new Cookie("name", login.getUsername());
			res.addCookie(cookie);
			return "welcome";
		}
		return "failure";
	}

	@GetMapping("/register")
	public String registerpage() {
		return "register";
	}

	@PostMapping("/register")
	public String register(@ModelAttribute RegisterModel reg, ModelMap mod) {
		boolean save = dao.save(reg);
		if (save) {
			mod.addAttribute("data", reg);
			return "success";
		}
		return "failure";
	}
	
	@GetMapping("/welcome")
	public String welcome(@CookieValue String name,ModelMap map) {
		map.addAttribute("name",name);
		return "welcome";
	}
}