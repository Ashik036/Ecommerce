package com.ecommers.app.dtos.fakedtos;

import com.ecommers.app.model.Product;
import lombok.Data;

@Data
public class FakeStoreGetAllProductDto {
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
        product.setCategory(category);
        return product;
    }
    FakeStoreResponseProductDto fakeStoreResponseProductDto;

    public static FakeStoreGetAllProductDto toFakeStoreGetAllProductDto(Product product){
      FakeStoreGetAllProductDto fakeStoreGetAllProductDto=new FakeStoreGetAllProductDto();
      fakeStoreGetAllProductDto.setFakeStoreResponseProductDto(FakeStoreResponseProductDto.toFakeStoreResponseProductDto(product));
      return fakeStoreGetAllProductDto;
    }
}
