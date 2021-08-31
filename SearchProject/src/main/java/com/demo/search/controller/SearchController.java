package com.demo.search.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/user/{userId}/{userName}")
	public String handler(@PathVariable("userId")int userId,@PathVariable("userName")String userName){
		System.out.println(userId);
		System.out.println(userName);
		return "home";
	}     

	@RequestMapping("/home")
	public String handleApp() {
		System.out.println("Home is running");
		String val=null;
		System.out.println(val.length());
		return "home";
	}

	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		String url = "https://www.google.com/search?q="+query;

		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		System.out.println(url);
		return redirectView;
	}
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NullPointerException.class)
	public String exceptionHandler(){
		System.out.println("Null Pointer Exception");
		return "error_page";
	}
}
