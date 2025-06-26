package com.ecommers.app.services;

import com.ecommers.app.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProductServiceDBimpl")
public class ProductServiceDBImpl implements ProductService{

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public List<Product> getAllProduct() {
        return List.of();
    }

    @Override
    public Product getProduct(Long id) {
        return null;
    }
}
