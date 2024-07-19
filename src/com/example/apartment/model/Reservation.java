package com.example.apartment.model;

import java.time.LocalDateTime;

public class Reservation {
    private Long id;
    private Facility facility; // 예약한 편의시설
    private Resident resident; // 예약한 입주민
    private LocalDateTime reservationTime; // 예약 시간

    public Reservation(Long id, Facility facility, Resident resident, LocalDateTime reservationTime) {
        this.id = id;
        this.facility = facility;
        this.resident = resident;
        this.reservationTime = reservationTime;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public Resident getResident() {
        return resident;
    }

    public void setResident(Resident resident) {
        this.resident = resident;
    }

    public LocalDateTime getReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(LocalDateTime reservationTime) {
        this.reservationTime = reservationTime;
    }
}
