package com.ecommers.app.dtos.fakedtos;

import com.ecommers.app.model.Product;
import lombok.Data;

@Data
public class FakeStoreGetProductDto {
    private Long id;
    private String title;
    private String description;
    private String category;
    private double price;
    private String image;
     public static Product toProduct(FakeStoreGetProductDto fakeStoreGetProductDto){
         Product product=new Product();
         product.setId(fakeStoreGetProductDto.getId());
         product.setDescription(fakeStoreGetProductDto.getDescription());
         product.setPrice(fakeStoreGetProductDto.getPrice());
         product.setName(fakeStoreGetProductDto.getTitle());
         product.setCategory(fakeStoreGetProductDto.getCategory());
         return product;
     }
}
