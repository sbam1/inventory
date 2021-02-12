package com.sbam.online_shopping.inventory.repository;

import com.sbam.online_shopping.inventory.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
