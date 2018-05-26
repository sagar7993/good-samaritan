package com.msmgym.application.repositories;

import com.msmgym.application.entities.Hospital;
import org.springframework.data.repository.CrudRepository;

public interface HospitalRepository extends CrudRepository<Hospital, Integer > {

}