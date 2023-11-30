package com.atul.auth.service;

import com.atul.auth.request.ProductRequest;
import com.atul.auth.response.ProductResponse;

import java.util.List;

public interface ProductService {

    List<ProductResponse> getAllProducts();

    ProductResponse getProductById(int productId) throws Exception;

    ProductResponse createProduct(ProductRequest productRequest);

    ProductResponse updateProduct(int productId, ProductRequest updatedProductRequest) throws Exception;

    void deleteProduct(int productId);
}
