package com.pms.patientservice.model;

// These imports are for JPA (database mapping) and validation annotations
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.UUID;

// @Entity tells Spring Boot and JPA that this class represents a table in the database.
@Entity
public class Patient {

    // @Id marks this field as the primary key (unique identifier)
    // @GeneratedValue will automatically generate a value for this field.
    // UUID is used here as a primary key instead of a numeric ID.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    // @NotNull means this field cannot be null (validation).
    private String name;

    // @Email ensures that this field must follow a valid email format.
    // @Column(unique = true) ensures no two patients have the same email in the database.
    @NotNull
    @Email
    @Column(unique = true)
    private String email;

    @NotNull
    private String address;

    // LocalDate is used here instead of a String for proper date handling.
    @NotNull
    private LocalDate dateOfBirth;

    // This field stores the date when the patient was registered.
    @NotNull
    private LocalDate registeredDate;

    // ----- GETTERS AND SETTERS -----
    // These methods allow safe access to private fields.
    // JPA (Hibernate) also uses these methods to read/write data to/from the database.

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDate getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(LocalDate registeredDate) {
        this.registeredDate = registeredDate;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
