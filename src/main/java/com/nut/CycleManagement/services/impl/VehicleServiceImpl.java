package com.nut.CycleManagement.services.impl;

import com.nut.CycleManagement.entities.VehicleEntity;
import com.nut.CycleManagement.repository.VehicleRepo;
import com.nut.CycleManagement.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {
    @Autowired
    private VehicleRepo vehicleRepo;

    @Override
    public Page<VehicleEntity> findAll(Pageable page) {
        return vehicleRepo.findAll(page);
    }

    @Override
    public Optional<VehicleEntity> findById(int id) {
        return vehicleRepo.findById(id);
    }

    @Override
    public VehicleEntity update(VehicleEntity vehicleEntity) {
        return vehicleRepo.save(vehicleEntity);
    }

    @Override
    public void delete(int id) {
        vehicleRepo.findById(id).ifPresentOrElse(vehicleEntity -> {
            vehicleEntity.setDeleted(true);
            vehicleRepo.save(vehicleEntity);
        }, () -> {
            throw new RuntimeException("Vehicle does not exist.");
        });
    }
}
