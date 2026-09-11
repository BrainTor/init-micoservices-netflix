package com.example.order_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final ProductClient productClient;

    public OrderController(ProductClient productClient) {
        this.productClient = productClient;
    }

    @GetMapping("/orders")
    public String getOrders() {
        ProductDTO product = productClient.getProducts();
        return "List of orders" + " with product: " + product.name() + ", price: " + product.price() + ", description: " + product.description();
    }
}
