package com.example.Evalutation_PROG2.Controlleur;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Evalutation_PROG2.Service.*;;

@RestController
public class Controller {
    List <ReservationService.getReservation> reservation = new ArrayList();

     @GetMapping("/booking")
     public List<ReservationService.getReservation> getAllReservations() {
         return reservation;
     }

     @PostMapping("/booking")
     public String createReservation(Reservation reservation) {
         
        
     }
     
    
}
