package com.controller.JeeBlog;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class UserController {
	
	@RequestMapping(value = "/helloUser", method = RequestMethod.GET)
	public ModelAndView helloWorld(ModelAndView model) {
		model = new ModelAndView("helloUser");
		String prenom = "Pierre";
		model.addObject("name", prenom);
		return model;
	}
}
