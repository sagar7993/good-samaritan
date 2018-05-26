package com.msmgym.application.controllers;

import com.msmgym.application.entities.Accident;
import com.msmgym.application.services.AccidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/accident")
public class AccidentController {

    @Autowired
    AccidentService accidentService;

    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes = "application/json")
    private void save(@RequestBody Accident accident){
        accidentService.saveAccident(accident);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.POST, consumes = "application/json")
    private @ResponseBody Accident findById(@RequestBody Accident accident){
        return accidentService.findById(accident.getId());
    }

    @RequestMapping(value = "/fetchAll", method = RequestMethod.GET)
    private @ResponseBody List<Accident> fetchAll(){
        return accidentService.fetchAllAccident();
    }

}