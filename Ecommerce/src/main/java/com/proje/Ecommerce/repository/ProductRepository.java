package com.proje.Ecommerce.repository;

import com.proje.Ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository  extends JpaRepository<Product, Integer> {
    Optional<Product> findByProductID(int productId);
    Optional<Product> findByName(String name);
    Optional<Product> findByBrand(String brand);
    Optional<Product> findByCategory(String category);
}
