package be.odisee.vanmoer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ObjectRetrievalFailureException;
import org.springframework.stereotype.Service;

import be.odisee.vanmoer.dao.*;
import be.odisee.vanmoer.domain.*;

@Service
public class RestServiceImplementatie implements RestService {

	@Autowired
	private LocatieRepository locatieRepository = null;
	@Override
	public List<Locatie> getAllLocatie(){
		List<Locatie> locaties = null;
		try {
			locaties = locatieRepository.findAll();
		}
		catch (ObjectRetrievalFailureException e) {
			e.printStackTrace();
		}
		return locaties;
	}

}
