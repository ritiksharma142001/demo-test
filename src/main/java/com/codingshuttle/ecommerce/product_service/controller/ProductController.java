package com.codingshuttle.ecommerce.product_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {


    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot";
    }

}
