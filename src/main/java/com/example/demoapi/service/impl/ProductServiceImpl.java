package com.example.demoapi.service.impl;

import com.example.demoapi.entity.ProductEntity;
import com.example.demoapi.repo.ProductRepo;
import com.example.demoapi.service.ProductService;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.sql.SQLDataException;
import java.util.List;
@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

   final ProductRepo productRepo;

    @Override
    public List<ProductEntity> GetAllProducts() throws SQLDataException, Exception {
        return productRepo.findAll();
    }
}
