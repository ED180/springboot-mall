package com.ED.springbootmall.dao;

import com.ED.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
