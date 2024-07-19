package com.example.apartment.controller;

import com.example.apartment.model.Reservation;
import com.example.apartment.service.ReservationService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class ReservationController {
    private ReservationService reservationService = new ReservationService();

    // ��� ���� ����� ��ȯ
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    // Ư�� ���ǽü��� ���� ����� �ð� ������ ��ȯ
    public List<Reservation> getReservationsByFacilityAndTime(Long facilityId, LocalDateTime startTime, LocalDateTime endTime) {
        return reservationService.getReservationsByFacilityAndTime(facilityId, startTime, endTime);
    }

    // Ư�� ������ ID�� ��ȯ
    public Optional<Reservation> getReservationById(Long id) {
        return reservationService.getReservationById(id);
    }

    // ���ο� ������ ����
    public Reservation createReservation(Reservation reservation) {
        return reservationService.saveReservation(reservation);
    }

    // Ư�� ������ ����
    public void deleteReservation(Long id) {
        reservationService.deleteReservationById(id);
    }
}