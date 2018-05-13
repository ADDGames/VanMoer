package be.odisee.vanmoer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ObjectRetrievalFailureException;
import org.springframework.stereotype.Service;

import be.odisee.vanmoer.dao.*;
import be.odisee.vanmoer.domain.*;

@Service
public class TransportServiceImplementatie implements TransportService {


	@Autowired
	private TransportRepository transportRepository = null;
	@Autowired
	private VoorstelRepository voorstelRepository = null;
	@Autowired
	private AanvraagRepository aanvraagRepository = null;
	@Override
	public List<Transport> getAllTransport() {
		List<Transport> transporten = null;
		try {
			transporten = transportRepository.findAll();
		}
		catch (ObjectRetrievalFailureException e) {
			e.printStackTrace();
		}
		return transporten;
	}

	@Override
	public List<Aanvraag> getAllAanvraag() {
		List<Aanvraag> aanvragen = null;
		try {
			aanvragen = aanvraagRepository.findAll();
		}
		catch (ObjectRetrievalFailureException e) {
			e.printStackTrace();
		}
		return aanvragen;
	}

	@Override
	public List<Voorstel> getAllVoorstel() {
		List<Voorstel> voorstellen = null;
		try {
			voorstellen = voorstelRepository.findAll();
		}
		catch (ObjectRetrievalFailureException e) {
			e.printStackTrace();
		}
		return voorstellen;
	}

}
