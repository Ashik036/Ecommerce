package com.ecommers.app.dtos.fakedtos;


import com.ecommers.app.model.Product;
import lombok.Data;

@Data
public class FakeStoreCreateProductRequestDto {
    private FakeStoreRequestProductDto fakeStoreRequestProductDto;
    public Product toProduct(){
        return fakeStoreRequestProductDto.toProduct();
    }
    public static FakeStoreCreateProductRequestDto toFakeStoreCreateProductRequestDto(Product product){
        FakeStoreCreateProductRequestDto fakeStoreRequestDto=new FakeStoreCreateProductRequestDto();
        fakeStoreRequestDto.setFakeStoreRequestProductDto(FakeStoreRequestProductDto.toFakeStoreRequestProductDto(product));
        return fakeStoreRequestDto;
    }
}
