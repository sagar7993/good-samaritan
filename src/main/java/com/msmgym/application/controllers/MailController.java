package com.msmgym.application.controllers;

import com.msmgym.application.beans.Email;
import com.msmgym.application.entities.Accident;
import com.msmgym.application.entities.Hospital;
import com.msmgym.application.entities.School;
import com.msmgym.application.services.AccidentService;
import com.msmgym.application.services.EmailService;
import com.msmgym.application.services.HospitalService;
import com.msmgym.application.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MailController {

    @Autowired
    EmailService emailService;

    @Autowired
    SchoolService schoolService;

    @Autowired
    HospitalService hospitalService;

    @Autowired
    AccidentService accidentService;

    @RequestMapping(value = "/mail", method = RequestMethod.POST, consumes = "application/json")
    private void sendEmail(@RequestBody Email email){
        emailService.sendEmail(email);
    }

    @RequestMapping(value = "/getEverything", method = RequestMethod.GET)
    private @ResponseBody Map<String, List> getEverything(){
        List<School> schoolList = schoolService.fetchAllSchool();
        List<Hospital> hospitalList = hospitalService.fetchAllHospital();
        List<Accident> accidentList = accidentService.fetchAllAccident();
        Map<String, List> map = new HashMap<>();
        map.put("schoolList", schoolList);
        map.put("hospitalList", hospitalList);
        map.put("accidentList", accidentList);
        return map;
    }

}
