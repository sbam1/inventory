package com.sbam.online_shopping.inventory.dto;

import com.github.dozermapper.core.Mapping;
import com.sbam.online_shopping.inventory.model.Product;
import com.sbam.online_shopping.inventory.model.Rack;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ItemDto {

    private long itemId;
    private String sku;
    private String name;
    private String description;

    private double price;
    private String color;
    private String size;
    private double weight;

    @Mapping("product.productId")
    private long productId;

    @Mapping("product.name")
    private String productName;

    @Mapping("rack.rackId")
    private long rackId;

    @Mapping("rack.rackNumber")
    private String rackNumber;


}
