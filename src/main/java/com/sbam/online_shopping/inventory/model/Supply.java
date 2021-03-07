package com.sbam.online_shopping.inventory.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Supply {

    @Id
    @Column(name = "supply_id")
    private long supplyId;

    private LocalDateTime supplyDate;
    private LocalDate estimatedDeliveryDate;
    private String description;
    private long quantity;
    private String status;

    @OneToOne
    @JoinColumn(name = "fk_product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "fk_supplier_id")
    private Supplier supplier;

}
