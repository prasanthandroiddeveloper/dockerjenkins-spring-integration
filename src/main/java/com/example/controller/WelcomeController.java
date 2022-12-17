package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
  
	@RequestMapping(value="/welcome", method = RequestMethod.GET)
	public ModelAndView displayMessage() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", "Welcome to spring mvc module JAVA");
		mav.setViewName("index"); 
		return mav;
	}
	
	
	@RequestMapping("/greet")
	public String greetMessage(Model model) {
		model.addAttribute("msg", "Welcome to springboot module");
		return "index";
	}
}
