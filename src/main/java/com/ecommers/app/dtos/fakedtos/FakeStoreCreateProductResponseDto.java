package com.ecommers.app.dtos.fakedtos;

import com.ecommers.app.model.Product;
import lombok.Data;

@Data
public class FakeStoreCreateProductResponseDto {
    private FakeStoreResponseProductDto fakeStoreResponseProductDto;
    public Product toProduct(){
        return fakeStoreResponseProductDto.toProduct();
    }
    public static FakeStoreCreateProductResponseDto toFakeStoreCreateProductResponseDto(Product product){
        FakeStoreCreateProductResponseDto fakeStoreCreateProductResponseDto=new FakeStoreCreateProductResponseDto();
        fakeStoreCreateProductResponseDto.setFakeStoreResponseProductDto(FakeStoreResponseProductDto.toFakeStoreResponseProductDto(product));
        return fakeStoreCreateProductResponseDto;
    }
}
