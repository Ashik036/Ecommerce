package com.ecommers.app.services;

import com.ecommers.app.dtos.fakedtos.FakeStoreCreateProductRequestDto;
import com.ecommers.app.dtos.fakedtos.FakeStoreCreateProductResponceDto;
import com.ecommers.app.dtos.fakedtos.FakeStoreGetProductDto;
import com.ecommers.app.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

//@Primary
@Service("ProductServiceFakeStoreImpl")
public class ProductServiceFakeStoreImpl implements ProductService{
  private RestTemplate restTemplate;

  public ProductServiceFakeStoreImpl(RestTemplate restTemplate){
      this.restTemplate = restTemplate;
  }

    @Override
    public Product createProduct(Product product) {
        FakeStoreCreateProductRequestDto fakeStoreCreateProductRequestDto=new FakeStoreCreateProductRequestDto();
        fakeStoreCreateProductRequestDto.setTitle(product.getName());
        fakeStoreCreateProductRequestDto.setDescription(product.getDescription());
        fakeStoreCreateProductRequestDto.setPrice(product.getPrice());
        fakeStoreCreateProductRequestDto.setCategory(product.getCategory());
        fakeStoreCreateProductRequestDto.setImage(product.getImageUrl());
        FakeStoreCreateProductResponceDto responceDto = restTemplate.postForObject("https://fakestoreapi.com/products",fakeStoreCreateProductRequestDto, FakeStoreCreateProductResponceDto.class);

        Product product1=new Product();
        product1.setName(responceDto.getTitle());
        product1.setDescription(responceDto.getDescription());
        product1.setCategory(responceDto.getCategory());
        product1.setPrice(responceDto.getPrice());
        product1.setImageUrl(responceDto.getImage());
        product1.setId(responceDto.getId());
        return product1;
    }

    @Override
    public List<Product> getAllProduct() {
        FakeStoreGetProductDto[] responseDtos =restTemplate.getForObject("https://fakestoreapi.com/products", FakeStoreGetProductDto[].class);
       List<Product> products=new ArrayList<>();
       for(FakeStoreGetProductDto responseDto: responseDtos){
           Product product=FakeStoreGetProductDto.toProduct(responseDto);
           products.add(product);
       }
       return products;
    }

    @Override
    public Product getProduct(Long productId) {
        FakeStoreGetProductDto fakeStoreGetProductDto=restTemplate.getForObject("https://fakestoreapi.com/products/"+productId,FakeStoreGetProductDto.class);
        return FakeStoreGetProductDto.toProduct(fakeStoreGetProductDto);
    }
}
