package com.sbam.online_shopping.inventory.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID itemId;
    private String sku;
    private String name;
    private String description;

    private double price;
    private String color;
    private String size;
    private double weight;

    @ManyToOne
    @JoinColumn(name = "fk_product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "fk_pallet_id")
    private Pallet pallet;

}
