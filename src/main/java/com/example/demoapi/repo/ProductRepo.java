package com.example.demoapi.repo;

import com.example.demoapi.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductEntity, Long> {
}
