package com.sbam.online_shopping.inventory.controller;


import com.sbam.online_shopping.inventory.dto.SupplierDto;
import com.sbam.online_shopping.inventory.dto.SuppliersDto;
import com.sbam.online_shopping.inventory.service.SupplierService;
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
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping(path = "/inventory/suppliers")
    public ResponseEntity<SuppliersDto> getSuppliers() {
        List<SupplierDto> suppliers = supplierService.getSuppliers();
        return ResponseEntity.status(HttpStatus.OK).body(new SuppliersDto(suppliers));

    }

    @PostMapping(path = "/inventory/suppliers")
    public ResponseEntity<SupplierDto> saveSupplier(@RequestBody SupplierDto dto) {
        return ResponseEntity.status(HttpStatus.OK).body(supplierService.saveSupplier(dto));
    }

    @GetMapping(path = "/inventory/suppliers/{supplierId}")
    public ResponseEntity<SupplierDto> getSupplier(@PathVariable String supplierId) {
        return ResponseEntity.status(HttpStatus.OK).body(supplierService.getSupplier(Long.parseLong(supplierId)));
    }

    @DeleteMapping("inventory/suppliers/{supplierId}")
    public ResponseEntity<Void> deleteSupplier(@PathVariable String supplierId) {
        supplierService.deleteSupply(Long.parseLong(supplierId));
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
