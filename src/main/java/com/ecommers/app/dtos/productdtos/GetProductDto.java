package com.ecommers.app.dtos.productdtos;

import com.ecommers.app.model.Product;
import lombok.Data;

@Data
public class GetProductDto {
    private Long id;
    private String title;
    private String description;
    private String category;
    private double price;
    private String image;
    public static GetProductDto getProductDto(Product product){
        GetProductDto getProductDto=new GetProductDto();
        getProductDto.setId(product.getId());
        getProductDto.setTitle(product.getName());
        getProductDto.setCategory(product.getCategory());
        getProductDto.setPrice(product.getPrice());
        getProductDto.setDescription(product.getDescription());
        return getProductDto;
    }
}
