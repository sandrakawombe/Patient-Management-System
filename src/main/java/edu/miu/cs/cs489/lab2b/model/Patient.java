package edu.miu.cs.cs489.lab2b.model;

import java.time.LocalDate;
import java.time.Period;

public class Patient {
    private int patientId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String mailingAddress;
    private LocalDate dateOfBirth;

    public Patient(int patientId, String firstName, String lastName,
                   String phoneNumber, String email, String mailingAddress,
                   LocalDate dateOfBirth) {
        this.patientId = patientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.mailingAddress = mailingAddress;
        this.dateOfBirth = dateOfBirth;
    }

    public int getPatientId() { return patientId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }
    public String getMailingAddress() { return mailingAddress; }
    public LocalDate getDateOfBirth() { return dateOfBirth; }

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
}
