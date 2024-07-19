package com.example.apartment.service;

import com.example.apartment.model.Reservation;
import com.example.apartment.repository.ReservationRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class ReservationService {
    private ReservationRepository reservationRepository = new ReservationRepository();

    // 모든 예약 목록을 조회
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    // 특정 편의시설의 예약 목록을 시간 범위로 조회
    public List<Reservation> getReservationsByFacilityAndTime(Long facilityId, LocalDateTime startTime, LocalDateTime endTime) {
        return reservationRepository.findByFacilityIdAndReservationTimeBetween(facilityId, startTime, endTime);
    }

    // ID로 예약 조회
    public Optional<Reservation> getReservationById(Long id) {
        return reservationRepository.findById(id);
    }

    // 예약 저장
    public Reservation saveReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    // ID로 예약 삭제
    public void deleteReservationById(Long id) {
        reservationRepository.deleteById(id);
    }
}
