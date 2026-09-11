package com.example.order_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "product-service")
public interface ProductClient {
    @GetMapping ("/product/products")
    ProductDTO getProducts();

}
