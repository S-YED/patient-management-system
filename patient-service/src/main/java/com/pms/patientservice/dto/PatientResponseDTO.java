package com.pms.patientservice.dto;

// DTO = Data Transfer Object
// This class is used to define the structure of patient data that will be
// sent back as a response to the client (frontend).
// It acts as a safe and clean data container, usually separate from the actual database entity.
public class PatientResponseDTO {

    // These are the properties (fields) of the DTO.
    // They represent the data that will be shown to the user when they request patient details.
    private String id;          // Unique ID of the patient
    private String name;        // Patient's name
    private String email;       // Patient's email address
    private String address;     // Patient's residential address
    private String dateOfBirth; // Patient's date of birth

    // ----- GETTERS AND SETTERS -----
    // These methods allow other classes to access and modify the above fields
    // while keeping the fields private (Encapsulation in Java).

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
