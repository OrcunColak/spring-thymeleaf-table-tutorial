package com.colak.springtutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {

    // http://localhost:8080/products
    @GetMapping("/products")
    public String showProducts(Model model) {
        List<Product> products = List.of(
                new Product("Oranges", 0.99),
                new Product("Apples", 1.29),
                new Product("Bananas", 0.59)
        );
        model.addAttribute("allProducts", products);
        return "products";
    }
}

