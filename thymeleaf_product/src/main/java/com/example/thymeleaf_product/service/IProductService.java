package com.example.thymeleaf_product.service;

import com.example.thymeleaf_product.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    boolean delete(int id);

    int findById(int id);

    Product find(int id);

    boolean update(Product product);
    List<Product> searchByName(String name);
    boolean add(Product product);
}
