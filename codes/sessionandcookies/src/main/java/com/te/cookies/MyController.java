package com.te.cookies;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
	
	@GetMapping("login")
	public String getLogin() {
		return "login";
	}
	
	@PostMapping("login")
	public String login(String username,String password,HttpServletResponse res) {
		Cookie cookie = new Cookie("name", username);
		res.addCookie(cookie);
		return "success";
	}
	
	@GetMapping("inbox")
	public String test(@CookieValue String name,Model model) {
		model.addAttribute("data", name);
		return "inbox";
	}
}
