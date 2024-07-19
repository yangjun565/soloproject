package com.example.apartment.repository;


import com.example.apartment.model.Facility;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

	public class FacilityRepository{
	    private List<Facility> facilities = new ArrayList<>();
	    private Long currentId = 1L;

	    // 모든 편의시설 목록을 반환
	    public List<Facility> findAll() {
	        return facilities;
	    }

	    // ID로 편의시설을 찾음
	    public Optional<Facility> findById(Long id) {
	        return facilities.stream().filter(facility -> facility.getId().equals(id)).findFirst();
	    }

	    // 편의시설을 저장
	    public Facility save(Facility facility) {
	        if (facility.getId() == null) {
	            facility.setId(currentId++);
	        }
	        facilities.add(facility);
	        return facility;
	    }

	    // 편의시설을 삭제
	    public void deleteById(Long id) {
	        facilities.removeIf(facility -> facility.getId().equals(id));
	    }
	}

