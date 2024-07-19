package com.example.apartment.service;

import com.example.apartment.model.Reservation;
import com.example.apartment.repository.ReservationRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class ReservationService {
    private ReservationRepository reservationRepository = new ReservationRepository();

    // ��� ���� ����� ��ȸ
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    // Ư�� ���ǽü��� ���� ����� �ð� ������ ��ȸ
    public List<Reservation> getReservationsByFacilityAndTime(Long facilityId, LocalDateTime startTime, LocalDateTime endTime) {
        return reservationRepository.findByFacilityIdAndReservationTimeBetween(facilityId, startTime, endTime);
    }

    // ID�� ���� ��ȸ
    public Optional<Reservation> getReservationById(Long id) {
        return reservationRepository.findById(id);
    }

    // ���� ����
    public Reservation saveReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    // ID�� ���� ����
    public void deleteReservationById(Long id) {
        reservationRepository.deleteById(id);
    }
}
