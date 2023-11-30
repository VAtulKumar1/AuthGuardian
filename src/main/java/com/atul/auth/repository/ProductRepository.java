package com.atul.auth.repository;

import com.atul.auth.model.Product;
import com.atul.auth.request.ProductRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product save(ProductRequest productRequest);
}
