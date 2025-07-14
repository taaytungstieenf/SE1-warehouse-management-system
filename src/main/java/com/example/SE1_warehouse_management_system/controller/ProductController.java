package com.example.SE1_warehouse_management_system.controller;

import com.example.SE1_warehouse_management_system.model.Product;
import com.example.SE1_warehouse_management_system.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public String viewProducts(Model model) {
        model.addAttribute("products", service.listAll());
        return "product_list";
    }

    @GetMapping("/products/new")
    public String showNewProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "product_form";
    }

    @PostMapping("/products/save")
    public String saveProduct(@ModelAttribute("product") Product product) {
        service.save(product);
        return "redirect:/products";
    }
}
