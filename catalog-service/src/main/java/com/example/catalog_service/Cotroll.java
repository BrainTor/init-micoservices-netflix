package com.example.catalog_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/api/catalog")
@RestController
public class Cotroll {
    
    @GetMapping("/test")
    public String test() {
        return "Hello World";
    }
}
