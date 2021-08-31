package com.maven.demo.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("This is my first url");
		return "index1";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("It's all about you.");
		return "about";
	}

	@RequestMapping("/drive")
	public String drive(Model m) {
		System.out.println("Driving towards the destination");
		m.addAttribute("name", "Shivashish Raorane");
		m.addAttribute("id", 143);

		List<String> subjects = new ArrayList<String>();
		subjects.add("Theory of Computaion");
		subjects.add("Engineering Drawing");
		subjects.add("Data Structure");

		m.addAttribute("sub", subjects);
		return "drive";

	}

	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", "Naira");

		LocalDateTime ldt = LocalDateTime.now();
		mav.addObject("localdatetime", ldt);
		// System.out.println(ldt);
		List<String> hobbies = new ArrayList<String>();
		hobbies.add("Dance");
		hobbies.add("painting");
		hobbies.add("boxing");
		mav.addObject("hobby", hobbies);
		System.out.println(hobbies);
		mav.setViewName("help");// page dikahne ke liye
		return mav;
	}

}
