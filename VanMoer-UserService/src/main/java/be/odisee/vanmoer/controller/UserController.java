package be.odisee.vanmoer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import be.odisee.vanmoer.domain.*;
import be.odisee.vanmoer.service.UserService;

@RestController
@RequestMapping("/")
public class UserController {
	
	@Autowired
	UserService userService;

	@RequestMapping (value = "/getAllUsers", method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE )
	public List<Rol> getAllUsers ()	{
		List<Rol> users = null;
		try {
			users = userService.getAllUsers();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}
	@RequestMapping (value = "/nieuwChauffeur", method=RequestMethod.POST)
	public Chauffeur nieuwChauffeur (@RequestBody Chauffeur chauffeur)	{
		Chauffeur nieuwChauffeur = null;
		try {
			nieuwChauffeur = userService.nieuwChauffeur(chauffeur);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return nieuwChauffeur;
	}
	@RequestMapping (value = "/nieuwKlant", method=RequestMethod.POST)
	public Klant nieuwKlant (@RequestBody Klant klant)	{
		Klant nieuwKlant = null;
		try {
			nieuwKlant = userService.nieuwKlant(klant);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return nieuwKlant;
	}
	@RequestMapping (value = "/nieuwTransportplanner", method=RequestMethod.POST)
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