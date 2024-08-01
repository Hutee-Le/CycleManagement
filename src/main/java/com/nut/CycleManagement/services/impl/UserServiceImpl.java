package com.nut.CycleManagement.services.impl;

import com.nut.CycleManagement.entities.UserEntity;
import com.nut.CycleManagement.repository.UserRepo;
import com.nut.CycleManagement.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Page<UserEntity> findAll(Pageable page) {
        return userRepo.findAll(page);
    }

    @Override
    public Optional<UserEntity> findById(int id) {
        return userRepo.findById(id);
    }

    @Override
    public UserEntity update(UserEntity userEntity) {
        return userRepo.save(userEntity);
    }

    public UserEntity registerUser(UserEntity user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepo.save(user);
    }

    @Override
    public void delete(int id) {
         // no function requirement
    }


    @Override
    public UserEntity findByEmailAndPassword(UserEntity entity) {
        return userRepo.findByEmailAndPassword(entity.getEmail(), entity.getPassword());
    }
}
