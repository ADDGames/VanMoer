package be.odisee.vanmoer.service;

import java.util.List;
import java.util.Optional;

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
		List<Rol> users = null;
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
	public List<Chauffeur> getAllChauffeurs() {
		List<Chauffeur> chauffeurs = null;
		try {
			chauffeurs = chauffeurRepository.findAll();
		}
		catch (ObjectRetrievalFailureException e) {
			e.printStackTrace();
		}
		return chauffeurs;
	}

	@Override
	public List<Klant> getAllKlanten() {
		List<Klant> klanten = null;
		try {
			klanten = klantRepository.findAll();
		}
		catch (ObjectRetrievalFailureException e) {
			e.printStackTrace();
		}
		return klanten;
	}

	@Override
	public List<Transportplanner> getAllTransportplanners() {
		List<Transportplanner> transportplanners = null;
		try {
			transportplanners = transportplannerRepository.findAll();
		}
		catch (ObjectRetrievalFailureException e) {
			e.printStackTrace();
		}
		return transportplanners;
	}

	@Override
	public Chauffeur getChauffeurById(int chauffeurId) {
		Chauffeur chauffeur = null;
		try {
			chauffeur = chauffeurRepository.findOne(chauffeurId);
		}
		catch (ObjectRetrievalFailureException e) {
			e.printStackTrace();
		}
		return chauffeur;
	}

	@Override
	public Klant getKlantById(int klantId) {
		Klant klant = null;
		try {
			klant = klantRepository.findOne(klantId);
		}
		catch (ObjectRetrievalFailureException e) {
			e.printStackTrace();
		}
		return klant;
	}

	@Override
	public Transportplanner getTransportplannerById(int transportplannerId) {
		Transportplanner transportplanner = null;
		try {
			transportplanner = transportplannerRepository.findOne(transportplannerId);
		}
		catch (ObjectRetrievalFailureException e) {
			e.printStackTrace();
		}
		return transportplanner;
	}

	@Override
	public Chauffeur nieuwChauffeur(Chauffeur chauffeur) throws Exception {
		if(chauffeurRepository.findByVoornaam(chauffeur.getVoornaam()) != null ||
				(chauffeurRepository.findByFamilienaam(chauffeur.getFamilienaam()) != null) ||
				(chauffeurRepository.findByGebruikersnaam(chauffeur.getGebruikersnaam()) != null)) {
			throw new Exception("Chauffeur already exists");
		} else {
			return chauffeurRepository.save(chauffeur);
		}
	}

	@Override
	public Klant nieuwKlant(Klant klant) throws Exception {
		if((klantRepository.findByVoornaam(klant.getVoornaam()) != null) ||
				(klantRepository.findByFamilienaam(klant.getFamilienaam()) != null) ||
				(klantRepository.findByGebruikersnaam(klant.getGebruikersnaam()) != null) ||
				(klantRepository.findByEmailadres(klant.getEmailadres()) != null)) {
			throw new Exception("Klant already exists");
		} else {
			return klantRepository.save(klant);
		}
	}

	@Override
	public Transportplanner nieuwTransportplanner(Transportplanner transportplanner) throws Exception {
		if((transportplannerRepository.findByVoornaam(transportplanner.getVoornaam()) != null) ||
				(transportplannerRepository.findByFamilienaam(transportplanner.getFamilienaam()) != null) ||
				(transportplannerRepository.findByGebruikersnaam(transportplanner.getGebruikersnaam()) != null) ||
				(transportplannerRepository.findByEmailadres(transportplanner.getEmailadres()) != null)) {
			throw new Exception("Transportplanner already exists");
		} else {
			return transportplannerRepository.save(transportplanner);
		}
	}

	@Override
	public Chauffeur setBezet(int chauffeurId) throws Exception {
		Chauffeur chauffeur = chauffeurRepository.findOne(chauffeurId);
		if(chauffeur == null) {
			throw new Exception("Chauffeur does not exist");
		} else if(chauffeur.getStatus() == "Bezet") {
			throw new Exception("Chauffeur already has status 'Bezet'");
		} else {
			return chauffeurRepository.setStatusForChauffeur(chauffeur.getId(),"Bezet");
		}
	}

	@Override
	public Chauffeur setChauffeurInactief(int chauffeurId) throws Exception {
		Chauffeur chauffeur = chauffeurRepository.findOne(chauffeurId);
		if(chauffeur == null) {
			throw new Exception("Chauffeur does not exist");
		} else if(chauffeur.getStatus() == "Inactief") {
			throw new Exception("Chauffeur already has status 'Inactief'");
		} else {
			return chauffeurRepository.setStatusForChauffeur(chauffeur.getId(),"Inactief");
		}
	}

	@Override
	public Klant setKlantInactief(int klantId) throws Exception {
		Klant klant = klantRepository.findOne(klantId);
		if(klant == null) {
			throw new Exception("Klant does not exist");
		} else if(klant.getStatus() == "Inactief") {
			throw new Exception("Klant already has status 'Inactief'");
		} else {
			return klantRepository.setStatusForKlant(klant.getId(),"Inactief");
		}
	}

	@Override
	public Transportplanner setTransportplannerInactief(int transportplannerId) throws Exception {
		Transportplanner transportplanner = transportplannerRepository.findOne(transportplannerId);
		if(transportplanner == null) {
			throw new Exception("Transportplanner does not exist");
		} else if(transportplanner.getStatus() == "Inactief") {
			throw new Exception("Transportplanner already has status 'Inactief'");
		} else {
			return transportplannerRepository.setStatusForTransportplanner(transportplanner.getId(),"Inactief");
		}
	}

	@Override
	public Chauffeur setChauffeurActief(int chauffeurId) throws Exception {
		Chauffeur chauffeur = chauffeurRepository.findOne(chauffeurId);
		if(chauffeur == null) {
			throw new Exception("Chauffeur does not exist");
		} else if(chauffeur.getStatus() == "Actief") {
			throw new Exception("Chauffeur already has status 'Actief'");
		} else {
			return chauffeurRepository.setStatusForChauffeur(chauffeur.getId(),"Actief");
		}
	}

	@Override
	public Klant setKlantActief(int klantId) throws Exception {
		Klant klant = klantRepository.findOne(klantId);
		if(klant == null) {
			throw new Exception("Klant does not exist");
		} else if(klant.getStatus() == "Actief") {
			throw new Exception("Klant already has status 'Actief'");
		} else {
			return klantRepository.setStatusForKlant(klant.getId(),"Actief");
		}
	}

	@Override
	public Transportplanner setTransportplannerActief(int transportplannerId) throws Exception {
		Transportplanner transportplanner = transportplannerRepository.findOne(transportplannerId);
		if(transportplanner == null) {
			throw new Exception("Transportplanner does not exist");
		} else if(transportplanner.getStatus() == "Actief") {
			throw new Exception("Transportplanner already has status 'Actief'");
		} else {
			return transportplannerRepository.setStatusForTransportplanner(transportplanner.getId(),"Actief");
		}
	}

}
