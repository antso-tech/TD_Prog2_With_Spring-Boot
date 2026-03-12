package com.example.Evalutation_PROG2.services;

import com.example.Evalutation_PROG2.entities.Reservation;
import java.util.*;

public interface ReservationService {
    List<Reservation> getAllReservation();
    List<Reservation> addReservation(List<Reservation> reservation);
    
}
