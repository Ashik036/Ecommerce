package com.ecommers.app.dtos.productdtos;

import com.ecommers.app.model.Product;
import lombok.Data;

@Data
public class GetProductResponceDto {
    private GetProductDto getProductDto;
    public static GetProductResponceDto getProductResponceDto(Product product){
        GetProductResponceDto productResponceDto=new GetProductResponceDto();
        GetProductDto productDto= GetProductDto.getProductDto(product);
        productResponceDto.getProductDto=productDto;
        return productResponceDto;
    }
}
