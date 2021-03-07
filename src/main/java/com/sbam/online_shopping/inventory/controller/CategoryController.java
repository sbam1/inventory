package com.sbam.online_shopping.inventory.controller;


import com.sbam.online_shopping.inventory.dto.CategoriesDto;
import com.sbam.online_shopping.inventory.dto.CategoryDto;
import com.sbam.online_shopping.inventory.service.CategoryService;
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
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping(path = "/inventory/categories")
    public ResponseEntity<CategoriesDto> getCategories() {
        List<CategoryDto> categories = categoryService.getCategories();
        return ResponseEntity.status(HttpStatus.OK).body(new CategoriesDto(categories));

    }

    @PostMapping(path = "/inventory/categories")
    public ResponseEntity<Void> saveCategory(@RequestBody CategoryDto dto) {
        categoryService.saveCategory(dto);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping(path = "/inventory/categories/{categoryId}")
    public ResponseEntity<CategoryDto> getCategory(@PathVariable String categoryId) {
        CategoryDto category = categoryService.getCategory(Long.parseLong(categoryId));
        return ResponseEntity.status(HttpStatus.OK).body(category);

    }

    @DeleteMapping("inventory/categories/{categoryId}")
    public ResponseEntity<Void> deleteCategory(@PathVariable String categoryId) {
        categoryService.deleteCategory(Long.parseLong(categoryId));
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
