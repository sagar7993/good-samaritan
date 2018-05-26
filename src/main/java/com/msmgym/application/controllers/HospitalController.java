package com.msmgym.application.controllers;

import com.msmgym.application.entities.Hospital;
import com.msmgym.application.services.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/hospital")
public class HospitalController {

    @Autowired
    HospitalService hospitalService;

    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes = "application/json")
    private void save(@RequestBody Hospital hospital){
        hospitalService.saveHospital(hospital);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.POST, consumes = "application/json")
    private @ResponseBody Hospital findById(@RequestBody Hospital hospital){
        return hospitalService.findById(hospital.getId());
    }

    @RequestMapping(value = "/fetchAll", method = RequestMethod.GET)
    private @ResponseBody List<Hospital> fetchAll(){
        return hospitalService.fetchAllHospital();
    }

}