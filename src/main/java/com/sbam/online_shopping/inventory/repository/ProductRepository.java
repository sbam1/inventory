package com.sbam.online_shopping.inventory.repository;

import com.sbam.online_shopping.inventory.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
