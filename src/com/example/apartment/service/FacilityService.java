package com.example.apartment.service;

import java.util.List;
import java.util.Optional;

import com.example.apartment.model.Facility;
import com.example.apartment.repository.FacilityRepository;

public class FacilityService {
    private FacilityRepository facilityRepository = new FacilityRepository();

    // 모든 편의시설 목록을 조회
    public List<Facility> getAllFacilities() {
        return facilityRepository.findAll();
    }

 // ID로 편의시설 조회
public Optional<Facility> getFacilityById(Long id) {
    return facilityRepository.findById(id);
}

// 편의시설 저장
public Facility saveFacility(Facility facility) {
    return facilityRepository.save(facility);
}

// ID로 편의시설 삭제
public void deleteFacilityById(Long id) {
    facilityRepository.deleteById(id);
}
}