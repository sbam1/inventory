package com.sbam.online_shopping.inventory.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Set;
import java.util.UUID;

@Entity
public class Aisle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID aisleId;

    private String name;
    private long aisleNumber;
    private String section;
    private int totalRack;

    @ManyToOne
    @JoinColumn(name = "fk_category_id")
    private Category category;

    @OneToMany(mappedBy = "aisle", targetEntity= Pallet.class,cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<Pallet> pallets;
}
