package com.nut.CycleManagement.controller;

import com.nut.CycleManagement.entities.MaintenaceRecordEntity;
import com.nut.CycleManagement.entities.VehicleEntity;
import com.nut.CycleManagement.models.MaintenaceRecordDTO;
import com.nut.CycleManagement.models.VehicleDTO;
import com.nut.CycleManagement.services.MaintenaceRecordService;
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
@RequestMapping("/api/maintenances")
public class MaintenaceRecordController {
    @Autowired
    private MaintenaceRecordService maintenaceRecordService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<Page<MaintenaceRecordEntity>> getAllMaintenaceRecords(Pageable page) {
        return ResponseEntity.status(HttpStatus.OK).body(this.maintenaceRecordService.findAll(page));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<MaintenaceRecordEntity>> getMaintenaceRecordById(@PathVariable("id") int id) {
        return ResponseEntity.status(HttpStatus.OK).body(this.maintenaceRecordService.findById(id));
    }

    @PostMapping
    public ResponseEntity<MaintenaceRecordEntity> createNewMaintenaceRecord(@RequestBody MaintenaceRecordDTO maintenaceRecordDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(this.maintenaceRecordService.update(modelMapper.map(maintenaceRecordDTO, MaintenaceRecordEntity.class)));
    }

    @PutMapping
    public ResponseEntity<MaintenaceRecordEntity> updateMaintenaceRecord(@RequestBody MaintenaceRecordDTO maintenaceRecordDTO) {
        return ResponseEntity.ok(this.maintenaceRecordService.update(modelMapper.map(maintenaceRecordDTO, MaintenaceRecordEntity.class)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMaintenaceRecord(@PathVariable("id") int id) {
        this.maintenaceRecordService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body("Delete success");
    }
}
