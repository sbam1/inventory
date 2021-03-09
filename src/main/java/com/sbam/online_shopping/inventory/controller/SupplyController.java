package com.sbam.online_shopping.inventory.controller;


import com.sbam.online_shopping.inventory.dto.SuppliesDto;
import com.sbam.online_shopping.inventory.dto.SupplyDto;
import com.sbam.online_shopping.inventory.service.SupplyService;
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
public class SupplyController {

    @Autowired
    private SupplyService supplyService;

    @GetMapping(path = "/inventory/supplies")
    public ResponseEntity<SuppliesDto> getSupplies() {
        List<SupplyDto> supplies = supplyService.getSupplies();
        return ResponseEntity.status(HttpStatus.OK).body(new SuppliesDto(supplies));

    }

    @PostMapping(path = "/inventory/supplies")
    public ResponseEntity<SupplyDto> saveSupply(@RequestBody SupplyDto dto) {
        return ResponseEntity.status(HttpStatus.OK).body(supplyService.createSupply(dto));
    }

    @GetMapping(path = "/inventory/supplies/{supplyId}")
    public ResponseEntity<SupplyDto> getSupply(@PathVariable String supplyId) {
        return ResponseEntity.status(HttpStatus.OK).body(supplyService.getSupply(Long.parseLong(supplyId)));
    }

    @DeleteMapping("inventory/supplies/{supplyId}")
    public ResponseEntity<Void> deleteSupply(@PathVariable String supplyId) {
        supplyService.deleteSupply(Long.parseLong(supplyId));
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
