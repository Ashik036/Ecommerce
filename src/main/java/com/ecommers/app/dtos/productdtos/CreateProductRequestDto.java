package com.ecommers.app.dtos.productdtos;

import com.ecommers.app.model.Product;
import lombok.Data;

@Data
public class CreateProductRequestDto {
    private CreateProductDto productDto;
    public Product toProduct(){
        Product product=new Product();
        product.setName(productDto.getTitle());
        product.setDescription(productDto.getDescription());
        product.setCategory(productDto.getCategory());
        product.setPrice(productDto.getPrice());
        product.setImageUrl(productDto.getImage());
        return product;
    }
}
