package com.example.apartment.repository;

import com.example.apartment.model.Resident;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ResidentRepository {
    private List<Resident> residents = new ArrayList<>();
    private Long currentId = 1L;

    // 모든 입주민 목록을 반환
    public List<Resident> findAll() {
        return residents;
    }

    // ID로 입주민을 찾음
    public Optional<Resident> findById(Long id) {
        return residents.stream().filter(resident -> resident.getId().equals(id)).findFirst();
    }

    // 입주민을 저장
    public Resident save(Resident resident) {
        if (resident.getId() == null) {
            resident.setId(currentId++);
        }
        residents.add(resident);
        return resident;
    }

    // 입주민을 삭제
    public void deleteById(Long id) {
        residents.removeIf(resident -> resident.getId().equals(id));
    }
}