package com.sbam.online_shopping.inventory.service;


import com.sbam.online_shopping.inventory.dto.CategoryDto;
import com.sbam.online_shopping.inventory.model.Category;
import com.sbam.online_shopping.inventory.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<CategoryDto> getCategories() {
        List<Category> categories = categoryRepository.findAll();
        return categories.stream().map(CategoryDto::new).collect(Collectors.toList());
    }

    public CategoryDto getCategory(long categoryId) {
        return categoryRepository.findById(categoryId).map(CategoryDto::new).orElse(null);
    }

    public void saveCategory(CategoryDto dto) {
        Category category = new Category();
        category.setName(dto.getName());
        category.setDescription(dto.getDescription());
        categoryRepository.save(category);
    }

    public void deleteCategory(long categoryId) {
        categoryRepository.deleteById(categoryId);
    }
}
