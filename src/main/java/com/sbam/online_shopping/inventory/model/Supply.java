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
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Supply {

    @Id
    @Column(name = "supply_id")
    private UUID supplyId;

    private LocalDateTime supplyDate;
    private String description;
    private long quantity;

    @ManyToOne
    @JoinColumn(name = "fk_brand_id")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "fk_supplier_id")
    private Supplier supplier;

    @OneToMany(mappedBy = "supply", targetEntity= Product.class,cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Product> products;
}
