package com.msmgym.application.services;

import com.msmgym.application.entities.Accident;
import com.msmgym.application.repositories.AccidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccidentService {

    @Autowired
    private AccidentRepository accidentRepository;

    public Accident findById(Integer accidentId){
        return accidentRepository.findOne(accidentId);
    }

    public Accident saveAccident(Accident accident){
        return accidentRepository.save(accident);
    }

    public List<Accident> fetchAllAccident(){
        return (List<Accident>) accidentRepository.findAll();
    }

}