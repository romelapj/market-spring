package com.romelapj.platzimarket.domain.repository;

import com.romelapj.platzimarket.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product> getAll();

    List<Product> getByCategory(int categoryId);

    Optional<List<Product>> getScarseProduct(int quantity);

    Optional<Product> getProduct(int productId);

    Product save(Product product);

    void delete(int productId);
}
