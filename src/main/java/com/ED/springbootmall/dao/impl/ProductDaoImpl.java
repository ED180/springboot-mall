package com.ED.springbootmall.dao.impl;

import com.ED.springbootmall.dao.ProductDao;
import com.ED.springbootmall.model.Product;
import com.ED.springbootmall.rowmapper.ProductRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Component
public class ProductDaoImpl implements ProductDao {
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Override
    public Product getProductById(Integer productId) {
        String sql = "select * from product where product_id = :productId";

        Map<String, Object> map = new HashMap<>();
        map.put("productId", productId);

        List<Product> productList = namedParameterJdbcTemplate.query(sql, map, new ProductRowMapper());

        if (productList.size() > 0) {
            return productList.get(0);
        } else {
            return null;
        }
    }
}
