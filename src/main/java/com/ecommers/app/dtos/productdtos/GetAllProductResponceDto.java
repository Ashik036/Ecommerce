package com.ecommers.app.dtos.productdtos;

import lombok.Data;

import java.util.List;

@Data
public class GetAllProductResponceDto {
    private List<GetProductDto> products;
}
