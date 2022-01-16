package com.sbam.online_shopping.inventory.repository;

import com.sbam.online_shopping.inventory.model.Aisle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface AisleRepository extends JpaRepository<Aisle, Long> {

    List<Aisle> findAllBySectionAndCategory_CategoryId(String section, long categoryId);
}
