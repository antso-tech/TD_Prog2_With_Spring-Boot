package com.example.Evalutation_PROG2.entities;

import java.time.LocalDate;

public class Reservation {
    private String clientName;
    private String phoneNumber;
    private String clientAddress;
    private String roomNumber;
    private String description;
    private LocalDate date;

    public Reservation(String clientName, String phoneNumber, String clientAddress, String roomNumber,
            String description, LocalDate date) {
        this.clientName = clientName;
        this.phoneNumber = phoneNumber;
        this.clientAddress = clientAddress;
        this.roomNumber = roomNumber;
        this.description = description;
        this.date = date;
    }

    public String getClientName() {
        return clientName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    

    
}
