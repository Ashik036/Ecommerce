package com.ecommers.app.dtos.productdtos;

import lombok.Data;

@Data
public class CreateProductDto {
    private String title;
    private String description;
    private String category;
    private double price;
    private String image;
}
