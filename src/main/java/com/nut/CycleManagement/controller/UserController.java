package com.nut.CycleManagement.controller;

import com.nut.CycleManagement.entities.RoleEntity;
import com.nut.CycleManagement.entities.UserEntity;
import com.nut.CycleManagement.models.UserDTO;
import com.nut.CycleManagement.services.RoleService;
import com.nut.CycleManagement.services.UserService;
import com.nut.CycleManagement.util.RoleEnum;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping
    public ResponseEntity<Page<UserEntity>> getAllUser(Pageable page) {
        return ResponseEntity.status(HttpStatus.OK).body(this.userService.findAll(page));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<UserEntity>> getUserById(@PathVariable("id") int id) {
        return ResponseEntity.status(HttpStatus.OK).body(this.userService.findById(id));
    }

    @PostMapping
    public ResponseEntity<UserEntity> createNewUser(@RequestBody UserDTO userDTO){
        String hashPassword = this.passwordEncoder.encode(userDTO.getPassword());

        Optional<RoleEntity> roleEntity = roleService.findById(RoleEnum.USER.getValue());

        userDTO.setPassword(hashPassword);
        userDTO.setRoleEntity(roleEntity.get());

        UserEntity newUser = this.userService.update(modelMapper.map(userDTO, UserEntity.class));
        return ResponseEntity.status(HttpStatus.CREATED).body(newUser);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") int id) {
        this.userService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body("Delete success");
    }

    @PutMapping
    public ResponseEntity<UserEntity> updateUser(@RequestBody UserDTO userDTO) {
        UserEntity updateUser = this.userService.update(modelMapper.map(userDTO, UserEntity.class));
        return ResponseEntity.ok(updateUser);
    }
}
