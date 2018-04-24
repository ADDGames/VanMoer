package be.odisee.vanmoer.dao;

import be.odisee.vanmoer.domain.*;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface KlantRepository extends JpaRepository<Klant, Integer> {
	Optional<Klant> findByEmailadres(@Param("emailadres")String email);
	Optional<Klant> findById(@Param("id")int id);
}