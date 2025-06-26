package com.ecommers.app.controllers;

import com.ecommers.app.dtos.productdtos.*;
import com.ecommers.app.model.Product;
import com.ecommers.app.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(@Qualifier("ProductServiceFakeStoreImpl") ProductService productService){
        this.productService=productService;
    }
    @PostMapping("")
    public CreateProductResponseDto createProduct(@RequestBody CreateProductRequestDto createProductRequestDto) {
        Product product=productService.createProduct(createProductRequestDto.toProduct());
        return CreateProductResponseDto.createProductResponseDto(product);
    }
    @GetMapping("/{id}")
    public GetProductResponceDto getProduct(@PathVariable("id") Long productId){
        Product product=productService.getProduct(productId);
        return GetProductResponceDto.getProductResponceDto(product);

    }
    @GetMapping("")
    public GetAllProductResponceDto getAllProduct(){
        List<Product> products=productService.getAllProduct();
        GetAllProductResponceDto responceDtos=new GetAllProductResponceDto();
        responceDtos.setProducts(new ArrayList<>());
        for(Product product:products){
            GetProductDto getProductDto=GetProductDto.getProductDto(product);
            responceDtos.getProducts().add(getProductDto);
        }
        return responceDtos;
    }
    @DeleteMapping("/{id}")
    public void deleteProduct(){

    }
}
