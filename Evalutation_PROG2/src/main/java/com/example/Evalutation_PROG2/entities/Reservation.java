package com.example.Evalutation_PROG2.entities;

import java.time.LocalDate;

public class Reservation {
    private String clientName;
    private String phoneNumber;
    private String clientAddress;
    private int roomNumber;
    private String description;
    private LocalDate date;
 

    public Reservation(String clientName, String phoneNumber, String clientAddress, int roomNumber,
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

    public int getRoomNumber() {
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

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Reservation [clientName=" + clientName + ", phoneNumber=" + phoneNumber + ", clientAddress="
                + clientAddress + ", roomNumber=" + roomNumber + ", description=" + description + ", date=" + date
                + "]";
    }

    
}
