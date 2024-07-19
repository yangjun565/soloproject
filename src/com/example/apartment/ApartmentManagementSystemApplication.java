package com.example.apartment;

import java.time.LocalDateTime;

import com.example.apartment.controller.FacilityController;
import com.example.apartment.controller.ReservationController;
import com.example.apartment.controller.ResidentController;
import com.example.apartment.model.Facility;
import com.example.apartment.model.Reservation;
import com.example.apartment.model.Resident;

public class ApartmentManagementSystemApplication {
    public static void main(String[] args) {
        // ���� ���� �ڵ�
        ResidentController residentController = new ResidentController();
        FacilityController facilityController = new FacilityController();
        ReservationController reservationController = new ReservationController();

        // ���� ������ �߰�
        Resident resident1 = new Resident(null, "John Doe", "john@example.com", "1234567890", true);
        Resident resident2 = new Resident(null, "Jane Smith", "jane@example.com", "0987654321", false);

        Facility facility1 = new Facility(null, "������");
        Facility facility2 = new Facility(null, "������");

        residentController.createResident(resident1);
        residentController.createResident(resident2);

        facilityController.createFacility(facility1);
        facilityController.createFacility(facility2);

        Reservation reservation1 = new Reservation(null, facility1, resident1, LocalDateTime.now());
        reservationController.createReservation(reservation1);

        // ��� ���ֹ� ���
        residentController.getAllResidents().forEach(resident -> System.out.println(resident.getName()));

        // ��� ���ǽü� ���
        facilityController.getAllFacilities().forEach(facility -> System.out.println(facility.getName()));

        // ��� ���� ���
        reservationController.getAllReservations().forEach(reservation -> System.out.println(
                "Reservation at " + reservation.getFacility().getName() + " by " + reservation.getResident().getName()));
    }
}
