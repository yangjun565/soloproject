package com.example.apartment.service;

import com.example.apartment.model.Resident;
import com.example.apartment.repository.ResidentRepository;

import java.util.List;
import java.util.Optional;

public class ResidentService {
    private ResidentRepository residentRepository = new ResidentRepository();

    // 모든 입주민 목록을 조회
    public List<Resident> getAllResidents() {
        return residentRepository.findAll();
    }

    // 입주한 입주민 목록을 조회
    public List<Resident> getOccupiedResidents() {
        return residentRepository.findAll().stream().filter(Resident::getIsOccupied).toList();
    }

    // 공실인 세대 목록을 조회
    public List<Resident> getUnoccupiedResidents() {
        return residentRepository.findAll().stream().filter(resident -> !resident.getIsOccupied()).toList();
    }

    // ID로 입주민 조회
    public Optional<Resident> getResidentById(Long id) {
        return residentRepository.findById(id);
    }

    // 입주민 저장
    public Resident saveResident(Resident resident) {
        return residentRepository.save(resident);
    }

    // ID로 입주민 삭제
    public void deleteResidentById(Long id) {
        residentRepository.deleteById(id);
    }
}