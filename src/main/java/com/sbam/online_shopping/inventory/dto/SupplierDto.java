package com.sbam.online_shopping.inventory.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class SupplierDto {
    private long supplierId;
    private String name;
    private String description;
}
