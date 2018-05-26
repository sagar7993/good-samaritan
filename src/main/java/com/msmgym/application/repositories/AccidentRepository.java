package com.msmgym.application.repositories;

import com.msmgym.application.entities.Accident;
import org.springframework.data.repository.CrudRepository;

public interface AccidentRepository extends CrudRepository<Accident, Integer > {

}