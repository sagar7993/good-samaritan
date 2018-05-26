package com.msmgym.application.repositories;

import com.msmgym.application.entities.School;
import org.springframework.data.repository.CrudRepository;

public interface SchoolRepository extends CrudRepository<School, Integer > {

}