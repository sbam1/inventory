package com.sbam.online_shopping.inventory.dto;

import com.github.dozermapper.core.Mapping;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class SupplyDto {
    private long supplyId;

    private LocalDateTime supplyDate;
    private LocalDate estimatedDeliveryDate;
    private String description;
    private long quantity;
    private String status;

    @Mapping("product.productId")
    private long productId;

    @Mapping("product.name")
    private String productName;

    @Mapping("supplier.supplierId")
    private long supplierId;

    @Mapping("supplier.name")
    private String supplierName;
}
