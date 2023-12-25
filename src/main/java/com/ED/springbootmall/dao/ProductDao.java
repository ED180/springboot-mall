package com.ED.springbootmall.dao;

import com.ED.springbootmall.constant.ProductCategory;
import com.ED.springbootmall.dto.ProductQueryParams;
import com.ED.springbootmall.dto.ProductRequest;
import com.ED.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    Integer countProduct(ProductQueryParams productQueryParams);
    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);


    void updateStock(Integer productId, Integer stock);
}
