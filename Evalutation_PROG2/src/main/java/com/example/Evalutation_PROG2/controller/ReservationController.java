package com.example.Evalutation_PROG2.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Reservation> createNewReservation(@RequestBody List<Reservation> reservation) {
        List<Reservation> addReservation = this.repositoryService.addReservation(reservation);
        return addReservation;
        
    }
    

}
