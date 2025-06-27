package com.ecommers.app.dtos.productdtos;

import com.ecommers.app.model.Product;
import lombok.Data;

@Data
public class GetProductResponceDto {
    private ResponseProductDto getProductDto;
    public static GetProductResponceDto getProductResponceDto(Product product){
        GetProductResponceDto productResponceDto=new GetProductResponceDto();
        productResponceDto.setGetProductDto(ResponseProductDto.getProductDto(product));
        return productResponceDto;
    }
    public Product toProduct(){
        return getProductDto.toProduct();
    }
}
