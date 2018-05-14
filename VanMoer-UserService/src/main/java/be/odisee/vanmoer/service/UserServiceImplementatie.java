package be.odisee.vanmoer.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ObjectRetrievalFailureException;
import org.springframework.stereotype.Service;

import be.odisee.vanmoer.domain.Chauffeur;
import be.odisee.vanmoer.domain.Klant;
import be.odisee.vanmoer.domain.Rol;
import be.odisee.vanmoer.domain.Transportplanner;
import be.odisee.vanmoer.dao.*;

@Service
public class UserServiceImplementatie implements UserService {

	@Autowired
	private ChauffeurRepository chauffeurRepository = null;
	@Autowired
	private KlantRepository klantRepository = null;
	@Autowired
	private TransportplannerRepository transportplannerRepository = null;
	
	@Override
	public List<Rol> getAllUsers(){
		List<Rol> users = new ArrayList();
		List<Chauffeur> chauffeurs = null;
		List<Klant> klanten = null;
		List<Transportplanner> transportplanners = null;
		try {
			chauffeurs = chauffeurRepository.findAll();
			klanten = klantRepository.findAll();
			transportplanners = transportplannerRepository.findAll();
			users.addAll(chauffeurs);
			users.addAll(klanten);
			users.addAll(transportplanners);
		}
		catch (ObjectRetrievalFailureException e) {
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public Chauffeur nieuwChauffeur(Chauffeur chauffeur) throws Exception {
		if(!chauffeurRepository.findByVoornaam(chauffeur.getVoornaam()).isEmpty() ||
				!chauffeurRepository.findByFamilienaam(chauffeur.getFamilienaam()).isEmpty() ||
				!chauffeurRepository.findByGebruikersnaam(chauffeur.getGebruikersnaam()).isEmpty()) {
			throw new Exception("Chauffeur already exists");
		} else {
			return chauffeurRepository.save(chauffeur);
		}
	}

	@Override
	public Klant nieuwKlant(Klant klant) throws Exception {
		if(!klantRepository.findByVoornaam(klant.getVoornaam()).isEmpty() ||
			!klantRepository.findByFamilienaam(klant.getFamilienaam()).isEmpty() ||
			!klantRepository.findByGebruikersnaam(klant.getGebruikersnaam()).isEmpty() ||
			!klantRepository.findByEmailadres(klant.getEmailadres()).isEmpty()) {
			throw new Exception("Klant already exists");
		} else {
			return klantRepository.save(klant);
		}
	}

	@Override
	public Transportplanner nieuwTransportplanner(Transportplanner transportplanner) throws Exception {
		if(!transportplannerRepository.findByVoornaam(transportplanner.getVoornaam()).isEmpty() ||
				!transportplannerRepository.findByFamilienaam(transportplanner.getFamilienaam()).isEmpty() ||
				!transportplannerRepository.findByGebruikersnaam(transportplanner.getGebruikersnaam()).isEmpty() ||
				!transportplannerRepository.findByEmailadres(transportplanner.getEmailadres()).isEmpty()) {
			throw new Exception("Transportplanner already exists");
		} else {
			return transportplannerRepository.save(transportplanner);
		}
	}

	@Override
	public Chauffeur setChauffeurStatus(int chauffeurId, String status) throws Exception {
		Chauffeur chauffeur = chauffeurRepository.findOne(chauffeurId);
		if(chauffeur == null) {
			throw new Exception("Chauffeur does not exist");
		}
		
		return chauffeurRepository.save(chauffeur);
	}

	@Override
	public Klant setKlantStatus(int klantId, String status) throws Exception {
		Klant klant = klantRepository.findOne(klantId);
		if(klant == null) {
			throw new Exception("Klant does not exist");
		} else if(klant.getStatus() == "Inactief") {
			throw new Exception("Klant already has status 'Inactief'");
		} else {
			klant.setStatus("Inactief");
			return klantRepository.save(klant);
		}
	}

	@Override
	public Transportplanner setTransportplannerStatus(int transportplannerId, String status) throws Exception {
		Transportplanner transportplanner = transportplannerRepository.findOne(transportplannerId);
		if(transportplanner == null) {
			throw new Exception("Transportplanner does not exist");
		} else if(transportplanner.getStatus() == "Inactief") {
			throw new Exception("Transportplanner already has status 'Inactief'");
		} else {
			transportplanner.setStatus("Inactief");
			return transportplannerRepository.save(transportplanner);
		}
	}

}
