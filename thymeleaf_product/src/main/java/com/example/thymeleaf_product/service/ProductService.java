package com.example.thymeleaf_product.service;

import com.example.thymeleaf_product.entity.Product;
import com.example.thymeleaf_product.repository.IProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    final IProductRepository productRepository;

    public ProductService(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public boolean delete(int id) {
        int i = findById(id);
        if (i != -1) {
            return productRepository.delete(i);
        }
        return false;
    }

    @Override
    public int findById(int id) {
        List<Product> productList = findAll();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Product find(int id) {
        return productRepository.find(id);
    }

    @Override
    public boolean update(Product product) {
        return productRepository.update(product);
    }

    @Override
    public List<Product> searchByName(String name) {
        return productRepository.searchByName(name);
    }

    @Override
    public boolean add(Product product) {
        return productRepository.add(product);
    }
}
