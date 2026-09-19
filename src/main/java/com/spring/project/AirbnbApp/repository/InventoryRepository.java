package com.spring.project.AirbnbApp.repository;

import com.spring.project.AirbnbApp.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory,Long> {
}
