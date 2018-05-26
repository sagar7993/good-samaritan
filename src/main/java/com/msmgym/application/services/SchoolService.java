package com.msmgym.application.services;

import com.msmgym.application.entities.School;
import com.msmgym.application.repositories.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    @Autowired
    private SchoolRepository schoolRepository;

    public School findById(Integer schoolId){
        return schoolRepository.findOne(schoolId);
    }

    public School saveSchool(School school){
        return schoolRepository.save(school);
    }

    public List<School> fetchAllSchool(){
        return (List<School>) schoolRepository.findAll();
    }

}