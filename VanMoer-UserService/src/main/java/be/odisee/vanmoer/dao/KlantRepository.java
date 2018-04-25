package be.odisee.vanmoer.dao;

import be.odisee.vanmoer.domain.*;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface KlantRepository extends JpaRepository<Klant, Integer> {
	Optional<List<Klant>> findByVoornaam(@Param("voornaam")String voornaam);
	Optional<List<Klant>> findByFamilienaam(@Param("familienaam")String familienaam);
	Optional<List<Klant>> findByGebruikersnaam(@Param("gebruikersnaam")String gebruikersnaam);
	Optional<List<Klant>> findByEmailadres(@Param("emailadres")String emailadres);
	Klant setStatusForKlant(@Param("id")int id, @Param("status")String string);
}