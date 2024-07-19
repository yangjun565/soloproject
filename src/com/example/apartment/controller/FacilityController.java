package com.example.apartment.controller;

import com.example.apartment.model.Facility;
import com.example.apartment.service.FacilityService;

import java.util.List;
import java.util.Optional;

public class FacilityController {
    private FacilityService facilityService = new FacilityService();

    // ��� ���ǽü� ����� ��ȯ
    public List<Facility> getAllFacilities() {
        return facilityService.getAllFacilities();
    }

    // Ư�� ���ǽü��� ID�� ��ȯ
    public Optional<Facility> getFacilityById(Long id) {
        return facilityService.getFacilityById(id);
    }

    // ���ο� ���ǽü��� ����
    public Facility createFacility(Facility facility) {
        return facilityService.saveFacility(facility);
    }

    // Ư�� ���ǽü��� ����
    public void deleteFacility(Long id) {
        facilityService.deleteFacilityById(id);
    }
}
