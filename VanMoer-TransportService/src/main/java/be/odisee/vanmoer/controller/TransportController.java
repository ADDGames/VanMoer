package be.odisee.vanmoer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import be.odisee.vanmoer.domain.*;
import be.odisee.vanmoer.service.TransportService;;

@RestController
public class TransportController {

	
	@Autowired
	TransportService transportService;

	@RequestMapping (path = "transports/getAll", method=RequestMethod.GET)
	public List<Transport> getAllTransport ()	{
		List<Transport> transporten = null;
		try {
			transporten = transportService.getAllTransport();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return transporten;
	}

	@RequestMapping (path = "voorstels/getAll", method=RequestMethod.GET)
	public List<Voorstel> getAllVoorstel ()	{
		List<Voorstel> voorstellen = null;
		try {
			voorstellen = transportService.getAllVoorstel();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return voorstellen;
	}

	@RequestMapping (path = "aanvraags/getAll", method=RequestMethod.GET)
	public List<Aanvraag> getAllAanvraag ()	{
		List<Aanvraag> aanvragen = null;
		try {
			aanvragen = transportService.getAllAanvraag();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return aanvragen;
	}
}
