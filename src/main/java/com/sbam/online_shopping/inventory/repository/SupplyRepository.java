package com.sbam.online_shopping.inventory.repository;

import com.sbam.online_shopping.inventory.model.Supply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplyRepository extends JpaRepository<Supply, Long> {
}
