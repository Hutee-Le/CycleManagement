package com.nut.CycleManagement.services.impl;

import com.nut.CycleManagement.entities.RoleEntity;
import com.nut.CycleManagement.repository.RoleRepo;
import com.nut.CycleManagement.repository.UserRepo;
import com.nut.CycleManagement.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepo roleRepo;

    @Override
    public Page<RoleEntity> findAll(Pageable page) {
        return roleRepo.findAll(page);
    }

    @Override
    public Optional<RoleEntity> findById(int id) {
        return roleRepo.findById(id);
    }

    @Override
    public RoleEntity update(RoleEntity roleEntity) {
        return roleRepo.save(roleEntity);
    }

    @Override
    public void delete(int id) {
    }
}
