package com.example.apartment.controller;

import com.example.apartment.model.Reservation;
import com.example.apartment.service.ReservationService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class ReservationController {
    private ReservationService reservationService = new ReservationService();

    // 모든 예약 목록을 반환
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    // 특정 편의시설의 예약 목록을 시간 범위로 반환
    public List<Reservation> getReservationsByFacilityAndTime(Long facilityId, LocalDateTime startTime, LocalDateTime endTime) {
        return reservationService.getReservationsByFacilityAndTime(facilityId, startTime, endTime);
    }

    // 특정 예약을 ID로 반환
    public Optional<Reservation> getReservationById(Long id) {
        return reservationService.getReservationById(id);
    }

    // 새로운 예약을 생성
    public Reservation createReservation(Reservation reservation) {
        return reservationService.saveReservation(reservation);
    }

    // 특정 예약을 삭제
    public void deleteReservation(Long id) {
        reservationService.deleteReservationById(id);
    }
}