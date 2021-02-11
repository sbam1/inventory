package com.sbam.online_shopping.inventory.repository;

import com.sbam.online_shopping.inventory.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ItemRepository extends JpaRepository<Item, UUID> {
}