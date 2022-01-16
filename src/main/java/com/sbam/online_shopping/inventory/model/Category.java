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
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "category_id")
    private long categoryId;

    private String name;
    private String description;

    @OneToMany(mappedBy = "category", targetEntity= Product.class,cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<Product> products;

    @OneToMany(mappedBy = "category", targetEntity= Aisle.class,cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<Aisle> aisles;

}
