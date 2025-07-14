package com.example.SE1_warehouse_management_system.repository;

import com.example.SE1_warehouse_management_system.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
