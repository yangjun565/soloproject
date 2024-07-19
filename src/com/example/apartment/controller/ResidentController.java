package com.example.apartment.controller;

import com.example.apartment.model.Resident;
import com.example.apartment.service.ResidentService;
import java.util.List;
import java.util.Optional;

	public class ResidentController {
	    private ResidentService residentService = new ResidentService();

	    // 모든 입주민 목록을 반환
	    public List<Resident> getAllResidents() {
	        return residentService.getAllResidents();
	    }

	    // 입주한 입주민 목록을 반환
	    public List<Resident> getOccupiedResidents() {
	        return residentService.getOccupiedResidents();
	    }

	    // 공실인 세대 목록을 반환
	    public List<Resident> getUnoccupiedResidents() {
	        return residentService.getUnoccupiedResidents();
	    }

	    // 특정 입주민을 ID로 반환
	    public Optional<Resident> getResidentById(Long id) {
	        return residentService.getResidentById(id);
	    }

	    // 새로운 입주민을 저장
	    public Resident createResident(Resident resident) {
	        return residentService.saveResident(resident);
	    }

	    // 특정 입주민을 삭제
	    public void deleteResident(Long id) {
	        residentService.deleteResidentById(id);
	    }
	}

