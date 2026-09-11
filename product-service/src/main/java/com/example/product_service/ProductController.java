package com.example.product_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/product")
public class ProductController {

    @GetMapping("/products")
    public ProductDTO getProducts() {
        return new ProductDTO("Iphone 15 pro max", 60000, "Its used phone");
    }

}
