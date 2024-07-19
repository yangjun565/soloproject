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

    // ��� ���� ����� ��ȯ
    public List<Reservation> findAll() {
        return reservations;
    }

    // ID�� ������ ã��
    public Optional<Reservation> findById(Long id) {
        return reservations.stream().filter(reservation -> reservation.getId().equals(id)).findFirst();
    }

    // Ư�� ���ǽü��� ���� ����� �ð� ������ ��ȯ
    public List<Reservation> findByFacilityIdAndReservationTimeBetween(Long facilityId, LocalDateTime startTime, LocalDateTime endTime) {
        return reservations.stream()
                .filter(reservation -> reservation.getFacility().getId().equals(facilityId)
                        && !reservation.getReservationTime().isBefore(startTime)
                        && !reservation.getReservationTime().isAfter(endTime))
                .collect(Collectors.toList());
    }

    // ������ ����
    public Reservation save(Reservation reservation) {
        if (reservation.getId() == null) {
            reservation.setId(currentId++);
        }
        reservations.add(reservation);
        return reservation;
    }

    // ������ ����
    public void deleteById(Long id) {
        reservations.removeIf(reservation -> reservation.getId().equals(id));
    }
}