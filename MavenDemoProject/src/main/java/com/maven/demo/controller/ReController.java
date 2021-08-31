package com.maven.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

	@RequestMapping("/one")
	public String one() {
		System.out.println("This is handler one");
		return "redirect:/enjoy";
	}

	@RequestMapping("/first")
	public RedirectView first() {

		System.out.println("This is my redirect view handler");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("enjoy");
		return redirectView;
	}

	@RequestMapping("/enjoy")
	public String two() {
		System.out.println("This is my second handler");
		return "contact";
	}

}
