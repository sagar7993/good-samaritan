package com.msmgym.application.controllers;

import com.msmgym.application.entities.School;
import com.msmgym.application.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/school")
public class SchoolController {

    @Autowired
    SchoolService schoolService;

    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes = "application/json")
    private void save(@RequestBody School school){
        schoolService.saveSchool(school);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.POST, consumes = "application/json")
    private @ResponseBody School findById(@RequestBody School school){
        return schoolService.findById(school.getId());
    }

    @RequestMapping(value = "/fetchAll", method = RequestMethod.GET)
    private @ResponseBody List<School> fetchAll(){
        return schoolService.fetchAllSchool();
    }

}