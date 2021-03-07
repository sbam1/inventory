package com.sbam.online_shopping.inventory.controller;


import com.sbam.online_shopping.inventory.dto.BrandDto;
import com.sbam.online_shopping.inventory.dto.BrandsDto;
import com.sbam.online_shopping.inventory.service.BrandService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@RestController
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping(path = "inventory/brands")
    public ResponseEntity<BrandsDto> getBrands() {
        log.info("get brands api called");
        List<BrandDto> brands = brandService.getBrands();
        return ResponseEntity.status(HttpStatus.OK).body(new BrandsDto(brands));
    }

    @GetMapping(path = "inventory/brands/{brandId}")
    public ResponseEntity<BrandDto> getBrand(@PathVariable String brandId) {
        log.info("get brands api called with brand Id:{}", brandId);
        BrandDto brand = brandService.getBrand(Long.parseLong(brandId));
        return ResponseEntity.status(HttpStatus.OK).body(brand);
    }

    @PutMapping(path = "inventory/brands/{brandId}")
    public ResponseEntity<BrandDto> updateBrand(@PathVariable String brandId) {
        log.info("update brands api called with brand Id:{}", brandId);
        BrandDto brand = brandService.getBrand(brandId);
        return ResponseEntity.status(HttpStatus.OK).body(brand);
    }

    @PostMapping(path = "inventory/brands")
    public ResponseEntity<BrandDto> saveBrand(@RequestBody BrandDto brandDto) {
        log.info("save brands api called with brandDto:{}", brandDto.toString());
        BrandDto brand = brandService.save(brandDto);
        return ResponseEntity.status(HttpStatus.OK).body(brand);
    }

    @DeleteMapping(path = "inventory/brands/{brandId}")
    public ResponseEntity<Void> deleteBrand(@PathVariable String brandId) {
        log.info("delete brands api called with brand Id:{}", brandId);
        brandService.deleteBrand(brandId);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
