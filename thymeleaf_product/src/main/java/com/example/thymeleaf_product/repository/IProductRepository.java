package com.example.thymeleaf_product.repository;

import com.example.thymeleaf_product.entity.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    boolean delete(Product product);

    Product find(int id);

    boolean update(Product product);

    List<Product> searchByName(String name);

    boolean add(Product product);
}
