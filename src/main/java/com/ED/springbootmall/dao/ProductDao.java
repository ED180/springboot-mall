package com.ED.springbootmall.dao;

import com.ED.springbootmall.dto.ProductRequest;
import com.ED.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
