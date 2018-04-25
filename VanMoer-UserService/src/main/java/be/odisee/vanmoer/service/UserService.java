package be.odisee.vanmoer.service;

import java.util.List;

import be.odisee.vanmoer.domain.*;

public interface UserService {
	public List<Rol> getAllUsers();
	public List<Chauffeur> getAllChauffeurs();
	public List<Klant> getAllKlanten();
	public List<Transportplanner> getAllTransportplanners();
	public Chauffeur getChauffeurById(int chauffeurId);
	public Klant getKlantById(int klantId);
	public Transportplanner getTransportplannerById(int transportplannerId);
	public Chauffeur nieuwChauffeur(Chauffeur chauffeur) throws Exception;
	public Klant nieuwKlant(Klant klant) throws Exception;
	public Transportplanner nieuwTransportplanner(Transportplanner transportplanner) throws Exception;
	public Chauffeur setBezet(int chauffeurId) throws Exception;
	public Chauffeur setChauffeurInactief(int chauffeurId) throws Exception;
	public Klant setKlantInactief(int klantId) throws Exception;
	public Transportplanner setTransportplannerInactief(int transportplannerId) throws Exception;
	public Chauffeur setChauffeurActief(int chauffeurId) throws Exception;
	public Klant setKlantActief(int klantId) throws Exception;
	public Transportplanner setTransportplannerActief(int transportplannerId) throws Exception;
}
