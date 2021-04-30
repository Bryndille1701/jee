package com.controller.JeeBlog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView helloWorld(ModelAndView model) {
		model = new ModelAndView("helloUser");
		String prenom = "Pierre";
		model.addObject("name", prenom);
		return model;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index(ModelAndView model) {
		model = new ModelAndView("helloUser");
		String prenom = "Pierre";
		model.addObject("name", prenom);
		return model;
	}
}
