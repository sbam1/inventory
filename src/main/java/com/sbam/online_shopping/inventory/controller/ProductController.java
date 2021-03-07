package com.sbam.online_shopping.inventory.controller;

import com.sbam.online_shopping.inventory.dto.ProductDto;
import com.sbam.online_shopping.inventory.dto.ProductsDto;
import com.sbam.online_shopping.inventory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(path = "/inventory/products")
    public ResponseEntity<ProductsDto> getProducts() {
        return ResponseEntity.status(HttpStatus.OK).body(new ProductsDto(productService.getProducts()));
    }

    @GetMapping(path = "/inventory/products/{productId}")
    public ResponseEntity<ProductDto> getProduct(@PathVariable String productId) {
        return ResponseEntity.status(HttpStatus.OK).body(productService.getProduct(Long.parseLong(productId)));
    }

    @PostMapping(path = "/inventory/products")
    public ResponseEntity<Void> saveProduct(@RequestBody ProductDto dto) {
        productService.saveProduct(dto);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping(path = "/inventory/products/{productId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable String productId) {
        productService.deleteProduct(Long.parseLong(productId));
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
