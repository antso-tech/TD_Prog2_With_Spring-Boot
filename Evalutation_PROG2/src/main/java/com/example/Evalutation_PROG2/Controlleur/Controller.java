package com.example.Evalutation_PROG2.Controlleur;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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
     public ResponseEntity<?> createReservation(@RequestBody List<ReservationService.getReservation> reservation) {
        boolean isAvailable = true;
        int findRoomNumber = reservation.stream().mapToInt(res -> res.roomNumber()).sum();

        for (ReservationService.getReservation res : reservation) {
            LocalDate findReservationDate = res.date();
            int findReservationRoomNumber = res.roomNumber();
               boolean isRoomAndDateTaken = reservationsList.stream().anyMatch(e -> e.date().equals(findReservationDate) && 
               e.roomNumber() == findReservationRoomNumber);

                if (isRoomAndDateTaken) {
                    isAvailable = false; 
                    break;

        }  
    }
        if(!isAvailable){
                return ResponseEntity.status(HttpStatusCode.valueOf(409)).body("Cette salle n'est pas disponible pour le moment !");

        }

        if(findRoomNumber > 10){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Cette Salle n'éxiste pas");

        }

        reservationsList.addAll(reservation);
        return ResponseEntity.status(HttpStatusCode.valueOf(201)).body(reservationsList);   


     }
     
     
    
}
