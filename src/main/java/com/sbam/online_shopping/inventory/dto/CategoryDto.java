package com.sbam.online_shopping.inventory.dto;

import com.sbam.online_shopping.inventory.model.Category;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CategoryDto {
    private long id;
    private String name;
    private String description;

    public CategoryDto(Category category) {
        this.id = category.getCategoryId();
        this.name = category.getName();
        this.description = category.getDescription();

    }
}
