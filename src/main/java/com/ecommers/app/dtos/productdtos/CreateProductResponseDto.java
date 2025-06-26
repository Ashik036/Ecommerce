package com.ecommers.app.dtos.productdtos;

import com.ecommers.app.model.Product;
import lombok.Data;

@Data
public class CreateProductResponseDto {
    private GetProductDto getProductDto;
    public static CreateProductResponseDto createProductResponseDto(Product product){
        CreateProductResponseDto createProductResponseDto=new CreateProductResponseDto();
        createProductResponseDto.getProductDto.setId(product.getId());
        createProductResponseDto.getProductDto.setTitle(product.getName());
        createProductResponseDto.getProductDto.setCategory(product.getCategory());
        createProductResponseDto.getProductDto.setDescription(product.getDescription());
        createProductResponseDto.getProductDto.setPrice(product.getPrice());
        createProductResponseDto.getProductDto.setImage(product.getImageUrl());

        return createProductResponseDto;
    }
}
