package com.sbam.online_shopping.inventory.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class BrandDto {
    private long id;
    private String name;
    private String description;
    private List<ProductDto> products;

    public BrandDto(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
