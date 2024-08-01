package com.nut.CycleManagement.repository;

import com.nut.CycleManagement.entities.MaintenaceRecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaintenaceRecordRepo extends JpaRepository<MaintenaceRecordEntity, Integer> {
}
