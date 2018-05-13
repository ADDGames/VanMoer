package be.odisee.vanmoer.service;

import java.util.List;

import be.odisee.vanmoer.domain.*;

public interface TransportService {
	public List<Transport> getAllTransport();
	public List<Aanvraag> getAllAanvraag();
	public List<Voorstel> getAllVoorstel();
}
