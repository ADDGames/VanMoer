package be.odisee.vanmoer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import be.odisee.vanmoer.service.HomeWebfrontService;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	protected HomeWebfrontService homeWebfrontService = null;
	
	@RequestMapping(value = { "/", "index.html"}, method=RequestMethod.GET)
	public String index(ModelMap model) {
        return "index";
    }
}
	
