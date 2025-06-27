package com.ecommers.app.services;

import com.ecommers.app.model.Product;

import java.util.List;

public interface ProductService {
  public Product createProduct(Product product);
  public List<Product> getAllProduct();
  public Product getProduct(Long id);
  public void delete(Long id);
  public void update(Long id);
}
