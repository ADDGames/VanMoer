package be.odisee.vanmoer.dao;

import be.odisee.vanmoer.domain.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ChauffeurRepository extends JpaRepository<Chauffeur, Integer> {
	List<Chauffeur> findByVoornaam(@Param("voornaam")String voornaam);
	List<Chauffeur> findByFamilienaam(@Param("familienaam")String familienaam);
	List<Chauffeur> findByGebruikersnaam(@Param("gebruikersnaam")String gebruikersnaam);
}
