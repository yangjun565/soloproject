package com.example.apartment.service;

import java.util.List;
import java.util.Optional;

import com.example.apartment.model.Facility;
import com.example.apartment.repository.FacilityRepository;

public class FacilityService {
    private FacilityRepository facilityRepository = new FacilityRepository();

    // ��� ���ǽü� ����� ��ȸ
    public List<Facility> getAllFacilities() {
        return facilityRepository.findAll();
    }

 // ID�� ���ǽü� ��ȸ
public Optional<Facility> getFacilityById(Long id) {
    return facilityRepository.findById(id);
}

// ���ǽü� ����
public Facility saveFacility(Facility facility) {
    return facilityRepository.save(facility);
}

// ID�� ���ǽü� ����
public void deleteFacilityById(Long id) {
    facilityRepository.deleteById(id);
}
}