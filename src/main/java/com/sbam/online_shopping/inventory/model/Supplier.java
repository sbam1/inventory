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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "supplier_id")
    private UUID supplierId;
    private String name;
    private String description;

    @OneToMany(mappedBy = "supplier" , targetEntity= Supply.class,cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<Supply> supplies;
}
