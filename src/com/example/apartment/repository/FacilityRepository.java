package com.example.apartment.repository;


import com.example.apartment.model.Facility;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

	public class FacilityRepository{
	    private List<Facility> facilities = new ArrayList<>();
	    private Long currentId = 1L;

	    // ��� ���ǽü� ����� ��ȯ
	    public List<Facility> findAll() {
	        return facilities;
	    }

	    // ID�� ���ǽü��� ã��
	    public Optional<Facility> findById(Long id) {
	        return facilities.stream().filter(facility -> facility.getId().equals(id)).findFirst();
	    }

	    // ���ǽü��� ����
	    public Facility save(Facility facility) {
	        if (facility.getId() == null) {
	            facility.setId(currentId++);
	        }
	        facilities.add(facility);
	        return facility;
	    }

	    // ���ǽü��� ����
	    public void deleteById(Long id) {
	        facilities.removeIf(facility -> facility.getId().equals(id));
	    }
	}

