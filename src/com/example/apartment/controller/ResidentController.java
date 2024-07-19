package com.example.apartment.controller;

import com.example.apartment.model.Resident;
import com.example.apartment.service.ResidentService;
import java.util.List;
import java.util.Optional;

	public class ResidentController {
	    private ResidentService residentService = new ResidentService();

	    // ��� ���ֹ� ����� ��ȯ
	    public List<Resident> getAllResidents() {
	        return residentService.getAllResidents();
	    }

	    // ������ ���ֹ� ����� ��ȯ
	    public List<Resident> getOccupiedResidents() {
	        return residentService.getOccupiedResidents();
	    }

	    // ������ ���� ����� ��ȯ
	    public List<Resident> getUnoccupiedResidents() {
	        return residentService.getUnoccupiedResidents();
	    }

	    // Ư�� ���ֹ��� ID�� ��ȯ
	    public Optional<Resident> getResidentById(Long id) {
	        return residentService.getResidentById(id);
	    }

	    // ���ο� ���ֹ��� ����
	    public Resident createResident(Resident resident) {
	        return residentService.saveResident(resident);
	    }

	    // Ư�� ���ֹ��� ����
	    public void deleteResident(Long id) {
	        residentService.deleteResidentById(id);
	    }
	}

