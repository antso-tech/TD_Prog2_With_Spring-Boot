package com.example.Evalutation_PROG2.Service;

import java.time.LocalDate;

public class ReservationService {
    public record getReservation(String clientName, String phoneNumber, int roomNumber, String description, LocalDate date){}

}
