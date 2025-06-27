package com.ecommers.app.dtos.fakedtos;

import com.ecommers.app.model.Product;
import lombok.Data;

@Data
public class FakeStoreResponseProductDto {
    private Long id;
    private String title;
    private String description;
    private String category;
    private double price;
    private String image;

     public Product toProduct(){
         Product product=new Product();
         product.setId(id);
         product.setDescription(description);
         product.setPrice(price);
         product.setName(title);
         product.setImageUrl(image);
         product.setCategory(category);
         return product;
     }
    public static FakeStoreResponseProductDto toFakeStoreResponseProductDto(Product product){
        FakeStoreResponseProductDto fakeStoreResponseProductDto=new FakeStoreResponseProductDto();
        fakeStoreResponseProductDto.setId(product.getId());
        fakeStoreResponseProductDto.setTitle(product.getName());
        fakeStoreResponseProductDto.setCategory(product.getCategory());
        fakeStoreResponseProductDto.setDescription(product.getDescription());
        fakeStoreResponseProductDto.setPrice(product.getPrice());
        fakeStoreResponseProductDto.setImage(product.getImageUrl());
        return fakeStoreResponseProductDto;
    }
}
