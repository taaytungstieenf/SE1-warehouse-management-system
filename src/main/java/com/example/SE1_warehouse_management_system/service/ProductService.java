package com.example.SE1_warehouse_management_system.service;

import com.example.SE1_warehouse_management_system.model.Product;
import com.example.SE1_warehouse_management_system.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;

    public List<Product> listAll() {
        return repo.findAll();
    }

    public void save(Product product) {
        repo.save(product);
    }
}