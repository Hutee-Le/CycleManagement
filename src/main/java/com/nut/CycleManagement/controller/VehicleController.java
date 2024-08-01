package com.nut.CycleManagement.controller;

import com.nut.CycleManagement.entities.RoleEntity;
import com.nut.CycleManagement.entities.UserEntity;
import com.nut.CycleManagement.entities.VehicleEntity;
import com.nut.CycleManagement.models.UserDTO;
import com.nut.CycleManagement.models.VehicleDTO;
import com.nut.CycleManagement.services.VehicleService;
import com.nut.CycleManagement.util.RoleEnum;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/vehicles")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<Page<VehicleEntity>> getAllVehicle(Pageable page) {
        return ResponseEntity.status(HttpStatus.OK).body(this.vehicleService.findAll(page));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<VehicleEntity>> getVehicleById(@PathVariable("id") int id) {
        return ResponseEntity.status(HttpStatus.OK).body(this.vehicleService.findById(id));
    }

    @PostMapping
    public ResponseEntity<VehicleEntity> createNewVehicle(@RequestBody VehicleDTO vehicleDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(this.vehicleService.update(modelMapper.map(vehicleDTO, VehicleEntity.class)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteVehicle(@PathVariable("id") int id) {
        this.vehicleService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body("Delete success");
    }

    @PutMapping
    public ResponseEntity<VehicleEntity> updateVehicle(@RequestBody VehicleDTO vehicleDTO) {
        return ResponseEntity.ok(this.vehicleService.update(modelMapper.map(vehicleDTO, VehicleEntity.class)));
    }
}
