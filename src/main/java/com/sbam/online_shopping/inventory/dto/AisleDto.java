package com.sbam.online_shopping.inventory.dto;

import com.github.dozermapper.core.Mapping;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class AisleDto {
    private long aisleId;

    private String name;
    private long aisleNumber;
    private String section;
    private int totalRack;

    @Mapping("category.categoryId")
    private  long categoryId;

    @Mapping("category.name")
    private String categoryName;
}
