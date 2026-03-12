package com.example.Evalutation_PROG2.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Evalutation_PROG2.entities.*;
import com.example.Evalutation_PROG2.services.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ReservationController {
    @Autowired
    private ReservationService repositoryService;

    @GetMapping("/booking")
    public List<Reservation> getReservations() {
        return repositoryService.getAllReservation();
    }

    @PostMapping("/booking")
    public ResponseEntity<?> createNewReservation(@RequestBody List<Reservation> reservation) {
        boolean is_available = false;

        for (Reservation res : reservation) {
            is_available = repositoryService.getAllReservation().stream().anyMatch
        (existingReservationn -> existingReservationn.getDate().equals(res.getDate()) && existingReservationn.getRoomNumber() == res.getRoomNumber());   
        
        }

        if (is_available) {
            return new ResponseEntity<>("Cette salle est déja réservée", HttpStatusCode.valueOf(409));
            
        }else{
            boolean roomInterval = reservation.stream().allMatch(newReservation -> newReservation.getRoomNumber() <= 9);
            if (!roomInterval) {
                return new ResponseEntity<>("Il l'éxiste pas de salles supérieur à 10", HttpStatusCode.valueOf(400));
                
            }
            List<Reservation> addReservation = this.repositoryService.addReservation(reservation);
            return ResponseEntity.status(HttpStatusCode.valueOf(201)).body(addReservation);
            
        }
        
        
    }


    

}
