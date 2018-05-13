package be.odisee.vanmoer.service;

import java.util.List;

import be.odisee.vanmoer.domain.*;

public interface TransportService {
	public List<Rol> getAllUsers();
	public Chauffeur nieuwChauffeur(Chauffeur chauffeur) throws Exception;
	public Klant nieuwKlant(Klant klant) throws Exception;
	public Transportplanner nieuwTransportplanner(Transportplanner transportplanner) throws Exception;
	public Chauffeur setBezet(int chauffeurId) throws Exception;
	public Chauffeur setChauffeurStatus(int chauffeurId, String status) throws Exception;
	public Klant setKlantStatus(int klantId, String status) throws Exception;
	public Transportplanner setTransportplannerStatus(int transportplannerId, String status) throws Exception;
}