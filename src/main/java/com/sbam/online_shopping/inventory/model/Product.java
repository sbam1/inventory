package com.sbam.online_shopping.inventory.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;
import java.util.UUID;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Product {

    @Id
    @Column(name = "product_id")
    private UUID productId;

    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "fk_supply_id")
    private Supply supply;

    @ManyToOne
    @JoinColumn(name = "fk_category_id")
    private Category category;

    @OneToMany(mappedBy = "product", targetEntity= Item.class,cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<Item> items;
}
