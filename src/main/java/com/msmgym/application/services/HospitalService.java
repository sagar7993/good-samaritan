package com.msmgym.application.services;

import com.msmgym.application.entities.Hospital;
import com.msmgym.application.repositories.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalService {

    @Autowired
    private HospitalRepository hospitalRepository;

    public Hospital findById(Integer hospitalId){
        return hospitalRepository.findOne(hospitalId);
    }

    public Hospital saveHospital(Hospital hospital){
        return hospitalRepository.save(hospital);
    }

    public List<Hospital> fetchAllHospital(){
        return (List<Hospital>) hospitalRepository.findAll();
    }

}