package com.example.Evalutation_PROG2.controller;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Evalutation_PROG2.entities.*;
import com.example.Evalutation_PROG2.services.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@RestController
public class ReservationController {
    @Autowired
    private ReservationService repositoryService;

    @GetMapping("/booking")
    public List<Reservation> getReservations() {
        return repositoryService.getAllReservation();
    }


    @SuppressWarnings("unlikely-arg-type")
    @PostMapping("/booking")
    public ResponseEntity<?> createNewReservation(@RequestBody List<Reservation> reservation) {
        boolean is_available = repositoryService.getAllReservation().stream().allMatch(previousReservation -> previousReservation.getDate().equals(reservation.stream().map(nextReservation -> nextReservation.getDate())));
        if (!is_available) {
            return new ResponseEntity<>("Cette salle est déja disponible", HttpStatusCode.valueOf(409));
            
        }else{
            List<Reservation> addReservation = this.repositoryService.addReservation(reservation);
            return ResponseEntity.status(HttpStatusCode.valueOf(201)).body(addReservation);
            
        }
        
        
    }


    

}
