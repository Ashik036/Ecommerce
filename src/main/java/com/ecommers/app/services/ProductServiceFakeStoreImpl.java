package com.ecommers.app.services;

import com.ecommers.app.dtos.fakedtos.FakeStoreCreateProductRequestDto;
import com.ecommers.app.dtos.fakedtos.FakeStoreCreateProductResponseDto;
import com.ecommers.app.dtos.fakedtos.FakeStoreGetAllProductDto;
import com.ecommers.app.dtos.fakedtos.FakeStoreResponseProductDto;
import com.ecommers.app.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//@Primary
@Service("ProductServiceFakeStoreImpl")
public class ProductServiceFakeStoreImpl implements ProductService{
  private RestTemplate restTemplate;

  public ProductServiceFakeStoreImpl(RestTemplate restTemplate){
      this.restTemplate = restTemplate;
  }

    @Override
    public Product createProduct(Product product) {
        FakeStoreCreateProductRequestDto fakeStoreCreateProductRequestDto=FakeStoreCreateProductRequestDto.toFakeStoreCreateProductRequestDto(product);
         FakeStoreResponseProductDto responceDto = restTemplate.postForObject("https://fakestoreapi.com/products",fakeStoreCreateProductRequestDto.getFakeStoreRequestProductDto(), FakeStoreResponseProductDto.class);
        FakeStoreCreateProductResponseDto responseDto=new FakeStoreCreateProductResponseDto();
        responseDto.setFakeStoreResponseProductDto(responceDto);
        return responseDto.toProduct();
    }

    @Override
    public List<Product> getAllProduct() {
        FakeStoreGetAllProductDto[] responseDtos =restTemplate.getForObject("https://fakestoreapi.com/products", FakeStoreGetAllProductDto[].class);
        List<FakeStoreGetAllProductDto> responseList= Stream.of(responseDtos).toList();
       List<Product> products=new ArrayList<>();
       for(FakeStoreGetAllProductDto fakeStoreGetAllProductDto: responseDtos){
           products.add(fakeStoreGetAllProductDto.toProduct());
       }
       return products;
    }

    @Override
    public Product getProduct(Long productId) {
        FakeStoreResponseProductDto fakeStoreGetProductDto=restTemplate.getForObject("https://fakestoreapi.com/products/"+productId, FakeStoreResponseProductDto.class);
        return fakeStoreGetProductDto.toProduct();
    }

    @Override
    public void delete(Long productId) {
       restTemplate.delete("https://fakestoreapi.com/products/"+productId);
    }

    @Override
    public void update(Long id) {

    }
}
