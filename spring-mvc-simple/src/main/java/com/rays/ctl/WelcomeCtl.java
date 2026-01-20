package com.rays.ctl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "Welcome")
public class WelcomeCtl {
	
	@GetMapping
	public String display(Model model) {
		model.addAttribute("message", "welcome to spring");
		System.out.println("display");
		return "Welcome";
	}
	
	@GetMapping("first")
	public String display1(Model model) {
		model.addAttribute("message", "welcome to first spring");
		return "Welcome";
	}
	
	@GetMapping("second")
	public String display2(Model model) {
		model.addAttribute("message", "welcome to second spring");
		return "Welcome";
	}
}
