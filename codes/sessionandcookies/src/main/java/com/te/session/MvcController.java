package com.te.session;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MvcController {
	
	@GetMapping("test")
	public String session(HttpServletRequest req) {
		HttpSession session = req.getSession();
		session.setAttribute("name", "Ajay");
		return "session";
	}
	
	@GetMapping("demo")
	public String demo(HttpServletRequest req,ModelMap map) {
		HttpSession session = req.getSession(false);
		String attribute =(String) session.getAttribute("name");
		map.addAttribute("data", attribute);
		return "demo";
	}
	
}
