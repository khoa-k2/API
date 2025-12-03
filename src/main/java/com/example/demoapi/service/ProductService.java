package com.example.demoapi.service;

import com.example.demoapi.entity.ProductEntity;

import java.sql.SQLDataException;
import java.util.List;

public interface ProductService {
public List<ProductEntity> GetAllProducts() throws SQLDataException,Exception;

}

