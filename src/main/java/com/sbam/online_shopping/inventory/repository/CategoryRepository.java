package com.sbam.online_shopping.inventory.repository;

import com.sbam.online_shopping.inventory.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
