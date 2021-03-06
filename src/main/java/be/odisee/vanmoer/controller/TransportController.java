package be.odisee.vanmoer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import be.odisee.vanmoer.domain.*;
import be.odisee.vanmoer.service.TransportService;

@RestController
public class TransportController {
	
	@Autowired
	TransportService userService;

	@RequestMapping (path = "/getAll", method=RequestMethod.GET)
	public List<Rol> getAllUsers ()	{
		List<Rol> users = null;
		try {
			users = userService.getAllUsers();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}
	@RequestMapping (path = "/nieuwChauffeur", method=RequestMethod.POST)
	public Chauffeur nieuwChauffeur (@RequestBody Chauffeur chauffeur)	{
		Chauffeur nieuwChauffeur = null;
		try {
			nieuwChauffeur = userService.nieuwChauffeur(chauffeur);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return nieuwChauffeur;
	}
	@RequestMapping (path = "/nieuwKlant", method=RequestMethod.POST)
	public Klant nieuwKlant (@RequestBody Klant klant)	{
		Klant nieuwKlant = null;
		try {
			nieuwKlant = userService.nieuwKlant(klant);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return nieuwKlant;
	}
	@RequestMapping (path = "/nieuwTransportplanner", method=RequestMethod.POST)
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