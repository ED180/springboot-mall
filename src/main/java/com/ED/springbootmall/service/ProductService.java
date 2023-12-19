package com.ED.springbootmall.service;

import com.ED.springbootmall.constant.ProductCategory;
import com.ED.springbootmall.dto.ProductQueryParams;
import com.ED.springbootmall.dto.ProductRequest;
import com.ED.springbootmall.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
