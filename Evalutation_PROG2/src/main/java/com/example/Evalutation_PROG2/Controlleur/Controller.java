package com.example.Evalutation_PROG2.Controlleur;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.Evalutation_PROG2.Service.*;

@RestController
public class Controller {
    List <ReservationService.getReservation> reservationsList = new ArrayList<>();

     @GetMapping("/booking")
     public List<ReservationService.getReservation> getAllReservations() {
         return reservationsList;
     }

    @PostMapping("/booking")
     public List<ReservationService.getReservation> createReservation(@RequestBody List<ReservationService.getReservation> reservation) {
        reservationsList.addAll(reservation);
    
        return reservationsList;

     }
     
    
}
