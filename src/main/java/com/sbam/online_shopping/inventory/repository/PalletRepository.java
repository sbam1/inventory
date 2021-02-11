package com.sbam.online_shopping.inventory.repository;

import com.sbam.online_shopping.inventory.model.Pallet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PalletRepository extends JpaRepository<Pallet, UUID> {
}
