package com.sbam.online_shopping.inventory.controller;

import com.sbam.online_shopping.inventory.dto.AisleDto;
import com.sbam.online_shopping.inventory.dto.AislesDto;
import com.sbam.online_shopping.inventory.service.AisleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AisleController {

    @Autowired
    private AisleService aisleService;

    @GetMapping(path = "inventory/aisles")
    public ResponseEntity<AislesDto> getAisles() {
        List<AisleDto> aisles = aisleService.getAisles();
        return ResponseEntity.status(HttpStatus.OK).body(new AislesDto(aisles));
    }


    @GetMapping(path = "inventory/aisles/{aisleId}")
    public ResponseEntity<AisleDto> getAisle(@PathVariable long aisleId) {
        AisleDto aisleDto = aisleService.getAisleById(aisleId);
        return ResponseEntity.status(HttpStatus.OK).body(aisleDto);
    }

    @PostMapping(path = "inventory/aisles")
    public ResponseEntity<AisleDto> saveBrand(@RequestBody AisleDto aisleDto) {
        AisleDto savedAisle = aisleService.saveAisle(aisleDto);
        return ResponseEntity.status(HttpStatus.OK).body(savedAisle);
    }

    @DeleteMapping(path = "inventory/aisles/{aisleId}")
    public ResponseEntity<Void> deleteBrand(@PathVariable long aisleId) {
        aisleService.deleteAisle(aisleId);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
