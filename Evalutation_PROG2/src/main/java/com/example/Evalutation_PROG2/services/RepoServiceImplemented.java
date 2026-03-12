package com.example.Evalutation_PROG2.services;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.example.Evalutation_PROG2.entities.Reservation;

public class RepoServiceImplemented implements RepositoryService{
    private List<Reservation> reservations = new ArrayList<>();

    public RepoServiceImplemented(){
        reservations.add(new Reservation("Jean Dupont",  "0612345678", "jean.dupont@email.com",101, "Chambre simple avec vue sur jardin", LocalDate.of(2025, 9, 5)));
        reservations.add(new Reservation("Marie Martin",
                "0687654321",
                "marie.martin@email.com", 
                205,
                "Chambre double avec balcon",
                LocalDate.of(2025, 9, 10)));
        reservations.add(      new Reservation(
                "Pierre Durand",
                "0798765432",
                "pierre.durand@email.com",
                312,
                "Suite familiale - 2 chambres",
                LocalDate.of(2025, 9, 15)
            ));
        
    }

    @Override
    public List<Reservation> getAllReservation() {
        return reservations;
    }
    
}
