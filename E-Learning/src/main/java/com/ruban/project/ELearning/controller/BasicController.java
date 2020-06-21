package com.ruban.project.ELearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/landing")
public class BasicController {

	@GetMapping("/page")
	public String sendLandingPage() {
		
		return "landing-page";
	}
	
	@GetMapping("/about")
	public String aboutUsPage() {
		
		return "about-us";
	}
}
