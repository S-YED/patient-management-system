package com.pms.patientservice.controller;

// Importing required classes
import com.pms.patientservice.dto.PatientResponseDTO; // DTO class for sending patient data as a response
import com.pms.patientservice.service.PatientService; // Service layer that contains business logic
import org.springframework.http.ResponseEntity;       // Wrapper for HTTP responses
import org.springframework.web.bind.annotation.GetMapping; // Annotation for GET requests
import org.springframework.web.bind.annotation.RequestMapping; // Base URL mapping
import org.springframework.web.bind.annotation.RestController; // Marks this class as a REST Controller

import java.util.List;

// This class is a REST controller responsible for handling HTTP requests for "patients".
// The @RestController annotation tells Spring Boot to treat it as a controller
// that returns data (JSON) instead of a web page.
@RestController
@RequestMapping("/patients")    // All APIs in this controller will start with /patients
// Example: https://localhost:4000/patients/
public class PatientController {

    // Dependency on PatientService (business logic)
    // Marked as 'final' because it should not be reassigned after construction
    private final PatientService patientService;

    // Constructor-based dependency injection.
    // Spring Boot will automatically provide (inject) a PatientService instance
    // when creating this controller object.
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    // This method handles HTTP GET requests to "/patients".
    // @GetMapping means this function runs when a GET request is made to /patients
    @GetMapping
    public ResponseEntity<List<PatientResponseDTO>> getPatients() {

        // Step 1: Call the service layer to fetch a list of patients
        // The service layer handles the business logic and communicates with the database through repository.
        List<PatientResponseDTO> patientResponseDTOs = patientService.getPatients();

        // Step 2: Wrap the list in a ResponseEntity with HTTP status 200 (OK) and return it.
        // Spring will automatically convert the List into JSON before sending it as a response.
        return ResponseEntity.ok(patientResponseDTOs);
    }
}
