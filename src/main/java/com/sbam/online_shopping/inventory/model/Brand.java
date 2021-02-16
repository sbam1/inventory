package com.sbam.online_shopping.inventory.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "brand_id")
    private long brandId;

    private String name;
    private String description;

    @OneToMany(mappedBy = "brand", targetEntity= Product.class,cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<Product> products;
}
