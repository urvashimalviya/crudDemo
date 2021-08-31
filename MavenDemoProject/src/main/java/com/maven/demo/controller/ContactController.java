package com.maven.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.maven.demo.model.User;
import com.maven.demo.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;

	@ModelAttribute
	public void commonDataForTheForm(Model m) {
		m.addAttribute("Header", "Welcome to the Page");
		m.addAttribute("Desc", "Home for the programmer");
		System.out.println("Common Data ");
	}

	@RequestMapping("/contact")
	public String showForm() {
		System.out.println("Controller Start: Creating Form");
		return "contact";
	}

	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute("user") User user, Model m) {

		int createdUSer = this.userService.createUSer(user);
		System.out.println("User created : " + createdUSer);
		System.out.println(user);
		System.out.println(user.getName());
		m.addAttribute("msg", "Created user's id :" +createdUSer);
		return "success";
	}

	/*
	 * @RequestMapping(path = "/processForm", method = RequestMethod.POST)
	 * public String handleForm(@RequestParam(name = "email", required = true)
	 * String userEmail,
	 * 
	 * @RequestParam("username") String username, @RequestParam("password")
	 * String password, Model m) {
	 * 
	 * System.out.println("USer EMail :" + userEmail); System.out.println(
	 * "Name :" + username); System.out.println("Password :" + password);
	 * 
	 * User user = new User(); user.setEmail(userEmail); user.setName(username);
	 * user.setPassword(password);
	 * 
	 * 
	 * m.addAttribute("email", userEmail); m.addAttribute("username", username);
	 * m.addAttribute("password", password);
	 * 
	 * 
	 * m.addAttribute("user", user); System.out.println(user);
	 * 
	 * return "success"; }
	 */
}
