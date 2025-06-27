package com.ecommers.app.dtos.productdtos;

import com.ecommers.app.model.Product;
import lombok.Data;

@Data
public class ResponseProductDto {
    private Long id;
    private String title;
    private String description;
    private String category;
    private double price;
    private String image;
    public Product toProduct(){
        Product product=new Product();
        product.setName(title);
        product.setId(id);
        product.setCategory(category);
        product.setPrice(price);
        product.setImageUrl(image);
        product.setDescription(description);
        return product;
    }
    public static ResponseProductDto getProductDto(Product product){
        ResponseProductDto getProductDto=new ResponseProductDto();
        getProductDto.setId(product.getId());
        getProductDto.setTitle(product.getName());
        getProductDto.setCategory(product.getCategory());
        getProductDto.setPrice(product.getPrice());
        getProductDto.setImage(product.getImageUrl());
        getProductDto.setDescription(product.getDescription());
        return getProductDto;
    }
}
