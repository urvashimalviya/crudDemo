package com.demo.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

	@RequestMapping("/complex")
	public String showForm() {
		System.out.println("Complex Form Handler Begins...");
		return "complex_form";
	}
	
	@RequestMapping("/handleform")
	public String handlForm(@ModelAttribute("student") Student student,BindingResult result){
		if(result.hasErrors()){
			return "complex_form";
		}
		
		System.out.println("Complex Form Handling in process");
		System.out.println(student);
		System.out.println(student.getDate().toString());
		System.out.println(student.getAddress());
		return "success";
	}
	
	

}
