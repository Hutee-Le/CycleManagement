package com.nut.CycleManagement.repository;

import com.nut.CycleManagement.entities.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<RoleEntity, Integer> {
}
