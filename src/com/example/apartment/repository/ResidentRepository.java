package com.example.apartment.repository;

import com.example.apartment.model.Resident;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ResidentRepository {
    private List<Resident> residents = new ArrayList<>();
    private Long currentId = 1L;

    // ��� ���ֹ� ����� ��ȯ
    public List<Resident> findAll() {
        return residents;
    }

    // ID�� ���ֹ��� ã��
    public Optional<Resident> findById(Long id) {
        return residents.stream().filter(resident -> resident.getId().equals(id)).findFirst();
    }

    // ���ֹ��� ����
    public Resident save(Resident resident) {
        if (resident.getId() == null) {
            resident.setId(currentId++);
        }
        residents.add(resident);
        return resident;
    }

    // ���ֹ��� ����
    public void deleteById(Long id) {
        residents.removeIf(resident -> resident.getId().equals(id));
    }
}