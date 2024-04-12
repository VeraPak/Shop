package org.example.ProductServices.ProductCategories;

import org.example.ProductServices.Product;

public class Book extends Product {
    String author;
    public Book(String productName, int productPrice, String author) {
        super(productName, productPrice);
        this.author = author;
    }
}
