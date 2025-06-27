package com.ecommers.app.dtos.productdtos;

import com.ecommers.app.model.Product;
import lombok.Data;

@Data
public class RequestProductDto {
    private String title;
    private String description;
    private String category;
    private double price;
    private String image;
    public Product toProduct(){
        Product product=new Product();
        product.setCategory(category);
        product.setDescription(description);
        product.setPrice(price);
        product.setImageUrl(image);
        product.setName(title);
        return product;
    }
    public static RequestProductDto toRequestProductDto(Product product){
        RequestProductDto requestProductDto=new RequestProductDto();
        requestProductDto.setTitle(product.getName());
        requestProductDto.setCategory(product.getCategory());
        requestProductDto.setDescription(product.getDescription());
        requestProductDto.setPrice(product.getPrice());
        requestProductDto.setImage(product.getImageUrl());
        return requestProductDto;
    }
}
