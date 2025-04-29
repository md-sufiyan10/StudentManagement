package com.sufi.tech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sufi.tech.services.StudentServices;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	private StudentServices services;
	@GetMapping("/students")
	public String getAllStudent(Model model){
		
		model.addAttribute("students",services.getAllStudent());
		return "students";
		
	}

}
