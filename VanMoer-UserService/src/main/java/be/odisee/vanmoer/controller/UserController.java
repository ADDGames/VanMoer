package be.odisee.vanmoer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import be.odisee.vanmoer.domain.*;
import be.odisee.vanmoer.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;

	@RequestMapping (path = "nieuwChauffeur", method=RequestMethod.POST)
	public Chauffeur nieuwChauffeur (@RequestBody Chauffeur chauffeur)	{
		Chauffeur nieuwChauffeur = null;
		try {
			nieuwChauffeur = userService.nieuwChauffeur(chauffeur);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return nieuwChauffeur;
	}
	@RequestMapping (path = "nieuwKlant", method=RequestMethod.POST)
	public Klant nieuwKlant (@RequestBody Klant klant)	{
		Klant nieuwKlant = null;
		try {
			nieuwKlant = userService.nieuwKlant(klant);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return nieuwKlant;
	}
	@RequestMapping (path = "nieuwTransportplanner", method=RequestMethod.POST)
	public Transportplanner nieuwTransportplanner (@RequestBody Transportplanner transportplanner)	{
		Transportplanner nieuwTransportplanner = null;
		try {
			nieuwTransportplanner = userService.nieuwTransportplanner(transportplanner);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return nieuwTransportplanner;
	}
}