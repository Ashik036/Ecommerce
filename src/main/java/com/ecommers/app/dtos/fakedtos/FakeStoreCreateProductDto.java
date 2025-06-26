package com.ecommers.app.dtos.fakedtos;

import lombok.Data;

@Data
public class FakeStoreCreateProductDto {
    private String title;
    private String description;
    private String category;
    private double price;
    private String image;
}
