package com.sbam.online_shopping.inventory.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class BrandsDto {

    private List<BrandDto> brands;

}
