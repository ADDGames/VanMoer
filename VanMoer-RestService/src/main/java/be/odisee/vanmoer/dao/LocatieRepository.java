package be.odisee.vanmoer.dao;

import be.odisee.vanmoer.domain.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface LocatieRepository extends JpaRepository<Locatie, Integer>{

}

