package com.sbam.online_shopping.inventory.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Pallet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID palletId;
    private int palletNumber;
    private int totalSize;
    private int totalItems;

    @ManyToOne
    private Aisle aisle;

    @OneToMany(mappedBy = "pallet", targetEntity= Item.class,cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Item> items;


}
