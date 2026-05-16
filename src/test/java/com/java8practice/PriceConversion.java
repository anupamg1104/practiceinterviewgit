package com.java8practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Example 4: Converting Product Prices to Different Currencies
//Scenario: Convert product prices from INR to USD (assuming 1 INR = 0.012 USD).

class Product {
    String name;
    double priceInINR;

    public Product(String name, double priceInINR) {
        this.name = name;
        this.priceInINR = priceInINR;
    }

    @Override
    public String toString() {
        return name + " - $" + priceInINR;
    }
}

public class PriceConversion {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 60000),
            new Product("Phone", 30000),
            new Product("Headphones", 2000)
        );

        // Convert prices from INR to USD
        List<Product> convertedProducts = products.stream()
                                                  .map(product -> new Product(product.name, product.priceInINR * 0.012))
                                                  .collect(Collectors.toList());

        System.out.println("Products with prices in USD: " + convertedProducts);
    }
}

//Explanation
//map(product -> new Product(product.name, product.priceInINR * 0.012)) → Converts INR to USD.

