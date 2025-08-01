package com.pms.patientservice.service;

import com.pms.patientservice.dto.PatientResponseDTO;
import com.pms.patientservice.mapper.PatientMapper;
import com.pms.patientservice.model.Patient;
import com.pms.patientservice.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// @Service marks this class as a "Service Layer" component in Spring Boot.
// This is where business logic (processing of data) is written.
// The Controller will call this Service, and this Service talks to the Repository (DB).
@Service
public class PatientService {

    // Reference to the Repository (Data Access Layer)
    // This will be injected automatically by Spring Boot (Dependency Injection).
    private PatientRepository patientRepository;

    // Constructor Injection: Spring Boot will pass the PatientRepository object when creating this service.
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    // This method fetches a list of patients and converts them to DTOs.
    public List<PatientResponseDTO> getPatients() {

        // 1. Fetch all patients from the database using the repository.
        // patientRepository.findAll() returns a List of Patient entities.
        List<Patient> patients = patientRepository.findAll();

        // 2. Convert the List<Patient> into List<PatientResponseDTO> using a mapper.
        // stream(): processes the list as a stream of data
        // map(PatientMapper::toDto): for each patient, call the toDto() method to convert it
        // toList(): collect the stream back into a list
        return patients.stream().map(PatientMapper::toDto).toList();
    }
}
