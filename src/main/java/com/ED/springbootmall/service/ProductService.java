package com.ED.springbootmall.service;

import com.ED.springbootmall.dto.ProductRequest;
import com.ED.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
