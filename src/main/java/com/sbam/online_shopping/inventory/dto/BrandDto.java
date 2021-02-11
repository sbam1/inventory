package com.sbam.online_shopping.inventory.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class BrandDto {
    private String name;
    private String description;
    private List<ProductDto> products;

    public BrandDto(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
