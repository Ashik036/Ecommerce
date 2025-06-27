package com.ecommers.app.dtos.fakedtos;

import com.ecommers.app.model.Product;
import lombok.Data;

@Data
public class FakeStoreRequestProductDto {
    private String title;
    private String description;
    private String category;
    private double price;
    private String image;
  public Product toProduct(){
      Product product=new Product();
      product.setName(title);
      product.setCategory(category);
      product.setDescription(description);
      product.setPrice(price);
      product.setImageUrl(image);
      return product;
  }
  public static  FakeStoreRequestProductDto toFakeStoreRequestProductDto(Product product){
      FakeStoreRequestProductDto fakeStoreResponseProductDto=new FakeStoreRequestProductDto();
      fakeStoreResponseProductDto.setTitle(product.getName());
      fakeStoreResponseProductDto.setDescription(product.getDescription());
      fakeStoreResponseProductDto.setCategory(product.getCategory());
      fakeStoreResponseProductDto.setImage(product.getImageUrl());
      fakeStoreResponseProductDto.setPrice(product.getPrice());
      return fakeStoreResponseProductDto;
  }
}
