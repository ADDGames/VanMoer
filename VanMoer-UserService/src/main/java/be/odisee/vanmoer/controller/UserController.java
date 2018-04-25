package be.odisee.vanmoer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import be.odisee.vanmoer.domain.Klant;
import be.odisee.vanmoer.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;

	@RequestMapping (path = "nieuwKlant", method=RequestMethod.POST) 
	Klant nieuwKlant (@RequestBody Klant klant)	{
		Klant nieuwKlant = null;
		try {
			nieuwKlant = userService.nieuwKlant(klant);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return nieuwKlant;
	}
}