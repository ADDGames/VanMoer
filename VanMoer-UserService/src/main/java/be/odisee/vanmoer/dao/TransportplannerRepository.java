package be.odisee.vanmoer.dao;

import be.odisee.vanmoer.domain.*;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TransportplannerRepository extends JpaRepository<Transportplanner, Integer> {
	Optional<List<Transportplanner>> findByVoornaam(@Param("voornaam")String voornaam);
	Optional<List<Transportplanner>> findByFamilienaam(@Param("familienaam")String familienaam);
	Optional<List<Transportplanner>> findByGebruikersnaam(@Param("gebruikersnaam")String gebruikersnaam);
	Optional<List<Transportplanner>> findByEmailadres(@Param("emailadres")String emailadres);
	Transportplanner setStatusForTransportplanner(@Param("id")int id, @Param("status")String string);
}
