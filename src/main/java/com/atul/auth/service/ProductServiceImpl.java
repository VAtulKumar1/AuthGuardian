package com.atul.auth.service;

import com.atul.auth.model.Product;
import com.atul.auth.request.ProductRequest;
import com.atul.auth.response.ProductResponse;
import com.atul.auth.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;


    public ProductServiceImpl(ProductRepository productRepository, ModelMapper modelMapper) {
        this.productRepository = productRepository;
        this.modelMapper = modelMapper;
    }

    public List<ProductResponse> getAllProducts() {
        List<Product> product=productRepository.findAll();
        List<ProductResponse> productResponse=product
                .stream()
                .map(user -> modelMapper.map(user, ProductResponse.class))
                .collect(Collectors.toList());

        return productResponse;
    }

    public ProductResponse getProductById(int productId) throws Exception {
        Product product=productRepository.findById(productId).orElseThrow(() -> new Exception("Product not found"));
        ProductResponse productResponse=modelMapper.map(product,ProductResponse.class);
        return productResponse;
    }

    public ProductResponse createProduct(ProductRequest productRequest) {
        Product product=modelMapper.map(productRequest,Product.class);
        ProductResponse productResponse=modelMapper.map(productRepository.save(product),ProductResponse.class);
        return productResponse;
    }

    public ProductResponse updateProduct(int productId, ProductRequest updatedProductRequest) throws Exception {
        Product updateProduct=productRepository.findById(productId).orElseThrow(()->new Exception("Product not found"));
        if(updatedProductRequest.getName()!=null)
            updateProduct.setName(updatedProductRequest.getName());
        if(updatedProductRequest.getDescription()!=null)
            updateProduct.setName(updatedProductRequest.getDescription());
        if(updatedProductRequest.getPrice()!=0.0)
            updateProduct.setPrice(updatedProductRequest.getPrice());
        Product product=productRepository.save(updateProduct);
        ProductResponse productResponse=modelMapper.map(product,ProductResponse.class);
        return productResponse;

    }

    public void deleteProduct(int productId) {
        productRepository.deleteById(productId);
    }
}

