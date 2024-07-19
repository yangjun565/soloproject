package com.example.apartment.repository;

import com.example.apartment.model.Reservation;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReservationRepository {
    private List<Reservation> reservations = new ArrayList<>();
    private Long currentId = 1L;

    // 모든 예약 목록을 반환
    public List<Reservation> findAll() {
        return reservations;
    }

    // ID로 예약을 찾음
    public Optional<Reservation> findById(Long id) {
        return reservations.stream().filter(reservation -> reservation.getId().equals(id)).findFirst();
    }

    // 특정 편의시설의 예약 목록을 시간 범위로 반환
    public List<Reservation> findByFacilityIdAndReservationTimeBetween(Long facilityId, LocalDateTime startTime, LocalDateTime endTime) {
        return reservations.stream()
                .filter(reservation -> reservation.getFacility().getId().equals(facilityId)
                        && !reservation.getReservationTime().isBefore(startTime)
                        && !reservation.getReservationTime().isAfter(endTime))
                .collect(Collectors.toList());
    }

    // 예약을 저장
    public Reservation save(Reservation reservation) {
        if (reservation.getId() == null) {
            reservation.setId(currentId++);
        }
        reservations.add(reservation);
        return reservation;
    }

    // 예약을 삭제
    public void deleteById(Long id) {
        reservations.removeIf(reservation -> reservation.getId().equals(id));
    }
}