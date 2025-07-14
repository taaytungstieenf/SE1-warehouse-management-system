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
    //
    @GetMapping("/products/edit/{id}")
    public String showEditProductForm(@PathVariable("id") Long id, Model model) {
        Product product = service.get(id);
        model.addAttribute("product", product);
        return "product_form";
    }

    @GetMapping("/products/delete/{id}")
    public String deleteProduct(@PathVariable("id") Long id) {
        service.deleteById(id);
        return "redirect:/products";
    }

    @GetMapping("/products/search")
    public String searchProducts(@RequestParam("code") String code, Model model) {
        Product product = service.findByCode(code);
        model.addAttribute("searchResult", product);
        return "product_search";
    }

}
