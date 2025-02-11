package com.leetcode2024spring.ecommercedemo1.collection;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.sql.Timestamp;
import java.util.Map;

@Data
@Builder

@Document(collection = "Products")
public class Product {
    public static final String SEQUENCE_NAME = "product_sequence";
    //    @Id
    private String product_string_id;

    private String product_name;
    private double current_price;
    private String category;
    private String brand;
    private String model;
    private Specification specifications;
//    private String image;
    private Price_history[] price_history;
    private Review[] review;

    public Product(String product_string_id,
                   String product_name,
                   double current_price,
                   String category,
                   String brand,
                   String model,
                   Specification specifications,
                   Price_history[] price_history,
                   Review[] review) {

        this.product_string_id = product_string_id;
        this.product_name = product_name;
        this.current_price = current_price;
        this.category = category;
        this.brand = brand;
        this.model = model;
        this.specifications = specifications;
        this.price_history = price_history;
        this.review = review;
    }
}


