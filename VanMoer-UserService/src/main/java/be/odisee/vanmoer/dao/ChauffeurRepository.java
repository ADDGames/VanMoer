package be.odisee.vanmoer.dao;

import be.odisee.vanmoer.domain.*;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ChauffeurRepository extends JpaRepository<Chauffeur, Integer> {
	Optional<List<Chauffeur>> findByVoornaam(@Param("voornaam")String voornaam);
	Optional<List<Chauffeur>> findByFamilienaam(@Param("familienaam")String familienaam);
	Optional<List<Chauffeur>> findByGebruikersnaam(@Param("gebruikersnaam")String gebruikersnaam);
	Chauffeur setStatusForChauffeur(@Param("id")int id, @Param("status")String status);
}
