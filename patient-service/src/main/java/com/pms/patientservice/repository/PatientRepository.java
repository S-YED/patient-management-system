package com.pms.patientservice.repository;

import com.pms.patientservice.model.Patient;  // Importing the Patient entity class
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// @Repository tells Spring Boot that this interface is a Data Access Layer component.
// This interface will be automatically implemented by Spring Data JPA at runtime.
@Repository
public interface PatientRepository extends JpaRepository<Patient, UUID> {
    /*
       By extending JpaRepository, you get many ready-made methods to work with the database
       without writing SQL queries manually.

       Examples of built-in methods:
         - findAll()        -> Fetch all patients
         - findById(id)     -> Fetch patient by ID
         - save(patient)    -> Insert or update a patient
         - deleteById(id)   -> Delete patient by ID

       The two generic types <Patient, UUID> mean:
         - Patient: The entity class this repository manages
         - UUID: The type of the primary key (ID) of the Patient entity
    */

    // If you need custom queries later, you can add method signatures here.
    // For example:
    // List<Patient> findByName(String name);
}
