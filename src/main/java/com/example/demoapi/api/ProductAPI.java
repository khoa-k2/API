package com.example.demoapi.api;

import com.example.demoapi.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/product")
public class ProductAPI {
    final private ProductService productService;
    @GetMapping("/get-all-product")
    public ResponseEntity<?>getAllProduct() throws Exception {
        return ResponseEntity.ok(productService.GetAllProducts());
    }

}
