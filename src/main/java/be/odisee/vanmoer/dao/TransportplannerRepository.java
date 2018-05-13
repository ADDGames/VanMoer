package be.odisee.vanmoer.dao;

import be.odisee.vanmoer.domain.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TransportplannerRepository extends JpaRepository<Transportplanner, Integer> {
	List<Transportplanner> findByVoornaam(@Param("voornaam")String voornaam);
	List<Transportplanner> findByFamilienaam(@Param("familienaam")String familienaam);
	List<Transportplanner> findByGebruikersnaam(@Param("gebruikersnaam")String gebruikersnaam);
	List<Transportplanner> findByEmailadres(@Param("emailadres")String emailadres);
}
