package com.example.apartment.model;

import java.util.ArrayList;
import java.util.List;

public class Facility {
    private Long id;
    private String name; // 편의시설 이름
    private List<Reservation> reservations; // 예약 목록

    public Facility(Long id, String name) {
        this.id = id;
        this.name = name;
        this.reservations = new ArrayList<>();
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}