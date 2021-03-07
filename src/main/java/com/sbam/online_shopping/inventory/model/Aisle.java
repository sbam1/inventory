package com.sbam.online_shopping.inventory.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Aisle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long aisleId;

    private String name;
    private long aisleNumber;
    private String section;
    private int totalRack;

    @ManyToOne
    @JoinColumn(name = "fk_category_id")
    private Category category;

    @OneToMany(mappedBy = "aisle", targetEntity= Rack.class,cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<Rack> racks;
}
