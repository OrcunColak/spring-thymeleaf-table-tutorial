package com.colak.springtutorial.controller.product;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Product {
    private final String name;
    private final double price;

}

