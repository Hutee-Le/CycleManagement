package com.nut.CycleManagement.controller;

import com.nut.CycleManagement.config.UserInfo;
import com.nut.CycleManagement.entities.UserEntity;
import com.nut.CycleManagement.models.UserDTO;
import com.nut.CycleManagement.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;

@RestController
@CrossOrigin
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserInfo userInfo;

    @PostMapping
    public ResponseEntity<UserInfo> login(@RequestBody UserDTO userDTO) {
        String hashPassword = Base64.getEncoder().encodeToString(userDTO.getPassword().getBytes());
        userDTO.setPassword(hashPassword);
        UserEntity user = this.userService.findByEmailAndPassword(modelMapper.map(userDTO, UserEntity.class));
        userInfo.setUserEntity(user);
        return ResponseEntity.ok(userInfo);
    }
}
