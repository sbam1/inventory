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

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Rack {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long rackId;
    private int rackNumber;
    private int totalSize;
    private int totalItems;

    @ManyToOne
    private Aisle aisle;

    @OneToMany(mappedBy = "rack", targetEntity= Item.class,cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Item> items;


    public boolean isRackFull() {
        return this.totalSize == this.totalItems;
    }
}
