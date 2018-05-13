package be.odisee.vanmoer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import be.odisee.vanmoer.domain.*;
import be.odisee.vanmoer.service.RestService;

@RestController
public class RestControllerr {

	
	@Autowired
	RestService restService;

	@RequestMapping (path = "locaties/getAll", method=RequestMethod.GET)
	public List<Locatie> getAllTransport ()	{
		List<Locatie> locaties = null;
		try {
			locaties = restService.getAllLocatie();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return locaties;
	}
}
