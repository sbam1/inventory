package com.sbam.online_shopping.inventory.repository;

import com.sbam.online_shopping.inventory.model.Rack;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RackRepository extends JpaRepository<Rack, Long> {

    List<Rack> findAllByAisle_AisleId(long aisleId);
}
