package com.example.thymeleaf_product.repository;

import com.example.thymeleaf_product.entity.Product;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    @Override
    public List<Product> findAll() {
        Session session = ConnectionUtil.sessionFactory.openSession();
        TypedQuery<Product> typedQuery = session.createQuery("from Product");
        List<Product> products = typedQuery.getResultList();
        session.close();
        return products;
    }

    @Override
    public boolean delete(int i) {
        Session session = ConnectionUtil.sessionFactory.openSession();
        TypedQuery<Product> typedQuery = session.createQuery("from Product");
        return true;
    }

    @Override
    public Product find(int id) {
        List<Product> products = findAll();
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public boolean update(Product product) {
        Session session = ConnectionUtil.sessionFactory.openSession();
        try {
            Transaction transaction = session.getTransaction();
            Product productOld = find(product.getId());
            transaction.begin();
            productOld.setName(product.getName());
            productOld.setDescription(product.getDescription());
            productOld.setPrice(product.getPrice());
            productOld.setProducer(product.getProducer());
            session.merge(product);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> products = findAll();
        List<Product> productsSearch = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().contains(name)) {
                productsSearch.add(product);
            }
        }
        return productsSearch;
    }

    @Override
    public boolean add(Product product) {
        Session session = ConnectionUtil.sessionFactory.openSession();
        System.out.println(product.getId());
        try {
            Transaction transaction = session.getTransaction();
            transaction.begin();
            session.persist(product);
            transaction.commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
