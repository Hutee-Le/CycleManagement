package com.nut.CycleManagement.repository;

import com.nut.CycleManagement.entities.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepo extends JpaRepository<VehicleEntity, Integer> {
}
