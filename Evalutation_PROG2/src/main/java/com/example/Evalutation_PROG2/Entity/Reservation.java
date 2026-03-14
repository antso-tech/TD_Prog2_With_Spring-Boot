package com.example.Evalutation_PROG2.Entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter 
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Reservation{
    private String name;
    private String phoneNumber;
    private String clientAddress;
    private int roomNumber;
    private String description;
    private LocalDate date;
}