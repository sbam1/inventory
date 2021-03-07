package com.sbam.online_shopping.inventory.dto;

import com.github.dozermapper.core.Mapping;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductDto {
    private long productId;
    private String name;
    private String description;

    @Mapping("brand.brandId")
    private long brandId;

    @Mapping("brand.name")
    private String brandName;

    @Mapping("category.categoryId")
    private long categoryId;

    @Mapping("category.name")
    private String categoryName;
}
