package com.ruban.project.ELearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentController {

	@GetMapping("/profile")
	public String String() {
		return "/students/student-profile";
	}
}
