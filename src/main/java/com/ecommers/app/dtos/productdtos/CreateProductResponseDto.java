package com.ecommers.app.dtos.productdtos;

import com.ecommers.app.model.Product;
import lombok.Data;

@Data
public class CreateProductResponseDto {
    private ResponseProductDto getProductDto;
    public static CreateProductResponseDto createProductResponseDto(Product product){
        CreateProductResponseDto createProductResponseDto=new CreateProductResponseDto();
        createProductResponseDto.setGetProductDto(ResponseProductDto.getProductDto(product));
        return createProductResponseDto;
    }
    public Product toProduct(){
        return getProductDto.toProduct();
    }
}
