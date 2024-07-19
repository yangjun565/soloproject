package com.example.apartment.controller;

import com.example.apartment.model.Facility;
import com.example.apartment.service.FacilityService;

import java.util.List;
import java.util.Optional;

public class FacilityController {
    private FacilityService facilityService = new FacilityService();

    // 모든 편의시설 목록을 반환
    public List<Facility> getAllFacilities() {
        return facilityService.getAllFacilities();
    }

    // 특정 편의시설을 ID로 반환
    public Optional<Facility> getFacilityById(Long id) {
        return facilityService.getFacilityById(id);
    }

    // 새로운 편의시설을 저장
    public Facility createFacility(Facility facility) {
        return facilityService.saveFacility(facility);
    }

    // 특정 편의시설을 삭제
    public void deleteFacility(Long id) {
        facilityService.deleteFacilityById(id);
    }
}
