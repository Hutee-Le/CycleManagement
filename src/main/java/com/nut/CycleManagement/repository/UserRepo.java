package com.nut.CycleManagement.repository;

import com.nut.CycleManagement.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepo extends JpaRepository<UserEntity, Integer> {
    UserEntity findByEmailAndPassword(String email, String password);
}
