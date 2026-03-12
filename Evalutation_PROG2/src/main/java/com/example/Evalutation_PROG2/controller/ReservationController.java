package com.example.Evalutation_PROG2.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Evalutation_PROG2.entities.*;
import com.example.Evalutation_PROG2.services.*;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ReservationController {
    @Autowired
    private RepositoryService repositoryService;

    @GetMapping("/findAll")
    public List<Reservation> getMethodName(@RequestParam String param) {
        return repositoryService.getAllReservation();
    }
    

}
