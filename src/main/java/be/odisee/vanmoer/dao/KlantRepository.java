package be.odisee.vanmoer.dao;

import be.odisee.vanmoer.domain.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface KlantRepository extends JpaRepository<Klant, Integer> {
	List<Klant> findByVoornaam(@Param("voornaam")String voornaam);
	List<Klant> findByFamilienaam(@Param("familienaam")String familienaam);
	List<Klant> findByGebruikersnaam(@Param("gebruikersnaam")String gebruikersnaam);
	List<Klant> findByEmailadres(@Param("emailadres")String emailadres);
}