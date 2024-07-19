package com.example.apartment.model;

import java.time.LocalDateTime;

public class Reservation {
    private Long id;
    private Facility facility; // ������ ���ǽü�
    private Resident resident; // ������ ���ֹ�
    private LocalDateTime reservationTime; // ���� �ð�

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
