package com.atul.auth.response;

import lombok.Data;

@Data
public class ProductResponse {
    private int id;
    private String name;
    private String description;
    private double price;
}
