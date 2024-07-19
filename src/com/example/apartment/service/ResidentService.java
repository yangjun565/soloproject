package com.example.apartment.service;

import com.example.apartment.model.Resident;
import com.example.apartment.repository.ResidentRepository;

import java.util.List;
import java.util.Optional;

public class ResidentService {
    private ResidentRepository residentRepository = new ResidentRepository();

    // ��� ���ֹ� ����� ��ȸ
    public List<Resident> getAllResidents() {
        return residentRepository.findAll();
    }

    // ������ ���ֹ� ����� ��ȸ
    public List<Resident> getOccupiedResidents() {
        return residentRepository.findAll().stream().filter(Resident::getIsOccupied).toList();
    }

    // ������ ���� ����� ��ȸ
    public List<Resident> getUnoccupiedResidents() {
        return residentRepository.findAll().stream().filter(resident -> !resident.getIsOccupied()).toList();
    }

    // ID�� ���ֹ� ��ȸ
    public Optional<Resident> getResidentById(Long id) {
        return residentRepository.findById(id);
    }

    // ���ֹ� ����
    public Resident saveResident(Resident resident) {
        return residentRepository.save(resident);
    }

    // ID�� ���ֹ� ����
    public void deleteResidentById(Long id) {
        residentRepository.deleteById(id);
    }
}