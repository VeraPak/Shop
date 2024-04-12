package org.example.ProductServices;

import org.example.ProductsDB;

import java.util.*;

public class RateProduct {
    private static Map<Product, List<Byte>> ratingMap = new HashMap<>();
    public static void rateProduct(byte rate, Product product) {
        if (rate < 0 || rate > 10) {
            throw new IllegalArgumentException("Оцените от 1 до 10");
        }
        if (ProductsDB.getProductsMap().containsKey(product)) {
            if (ratingMap.containsKey(product)){
                ratingMap.get(product).add(rate);
            }
            ratingMap.put(product, new LinkedList<>(Collections.singletonList(rate)));
        }
    }

    public static Map<Product, List<Byte>> getRatingMap() {
        return ratingMap;
    }
}
