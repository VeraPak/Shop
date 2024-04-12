package org.example;

import org.example.ProductServices.Product;
import org.example.ShopService.FilterProducts;

import java.util.HashMap;
import java.util.Map;

public class ProductsDB {
    private static Map<Product, Integer> products = new HashMap<>();

    public static void addNewProduct(Product product, int count){
        products.put(product, count);
    }

    public static void filterByNameAscending() {
        products = FilterProducts.filterByNameAscending(products);
    }

    public static void filterByNameDescending() {
        products = FilterProducts.filterByNameDescending(products);
    }

    public static void filterByPriceAscending() {
        products = FilterProducts.filterByPriceAscending(products);
    }

    public static void filterByPriceDescending() {
        products = FilterProducts.filterByPriceDescending(products);
    }

    public static Map<Product, Integer> getProductsMap() {
        return products;
    }
}