package com.pms.patientservice.mapper;

import com.pms.patientservice.dto.PatientResponseDTO;
import com.pms.patientservice.model.Patient;

// Mapper classes are utility classes that convert one object type to another.
// Here, we are converting the database entity 'Patient' into a 'PatientResponseDTO'
// so that we can safely send only the required data to the client.
public class PatientMapper {

    // 'toDto' is a static method that converts a Patient object (from DB)
    // into a PatientResponseDTO object (for sending as JSON response).
    public static PatientResponseDTO toDto(Patient patient) {

        // 1. Create a new DTO object
        PatientResponseDTO patientDTO = new PatientResponseDTO();

        // 2. Copy data from the Patient entity to the DTO
        // Note: toString() is used on ID and dateOfBirth in case those fields
        // are stored as different data types (UUID/Date) in the entity.
        patientDTO.setId(patient.getId().toString());
        patientDTO.setName(patient.getName());
        patientDTO.setAddress(patient.getAddress());
        patientDTO.setEmail(patient.getEmail());
        patientDTO.setDateOfBirth(patient.getDateOfBirth().toString());

        // 3. Return the filled DTO object
        return patientDTO;
    }
}
