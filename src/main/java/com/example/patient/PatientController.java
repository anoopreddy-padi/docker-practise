package com.example.patient;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PatientController {
    @GetMapping("/getAllPatients")
    public String getAllPatients(){
        return "All Patients";
    }
}