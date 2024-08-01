package com.nut.CycleManagement.services.impl;

import com.nut.CycleManagement.entities.MaintenaceRecordEntity;
import com.nut.CycleManagement.repository.MaintenaceRecordRepo;
import com.nut.CycleManagement.repository.UserRepo;
import com.nut.CycleManagement.services.MaintenaceRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MaintenaceRecordServiceImpl implements MaintenaceRecordService {
    @Autowired
    private MaintenaceRecordRepo maintenaceRecordRepo;

    @Override
    public Page<MaintenaceRecordEntity> findAll(Pageable page) {
        return maintenaceRecordRepo.findAll(page);
    }

    @Override
    public Optional<MaintenaceRecordEntity> findById(int id) {
        return maintenaceRecordRepo.findById(id);
    }

    @Override
    public MaintenaceRecordEntity update(MaintenaceRecordEntity maintenaceRecordEntity) {
        return maintenaceRecordRepo.save(maintenaceRecordEntity);
    }

    @Override
    public void delete(int id) {
//        maintenaceRecordRepo.deleteById(id);
    }
}
