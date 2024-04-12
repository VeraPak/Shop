package org.example.ShopService;

import org.example.ProductServices.Product;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterProducts {
    public static Map<Product, Integer> filterByNameAscending(Map<Product, Integer> products) {
        return products.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Product::getProductName)))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }

    public static Map<Product, Integer> filterByNameDescending(Map<Product, Integer> products) {
        return products.entrySet().stream()
                .sorted(Map.Entry.comparingByKey((Comparator.comparing(Product::getProductName).reversed())))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }

    public static Map<Product, Integer> filterByPriceAscending(Map<Product, Integer> products) {
        return products.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Product::getProductPrice)))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }

    public static Map<Product, Integer> filterByPriceDescending(Map<Product, Integer> products) {
        return products.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Product::getProductPrice).reversed()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }
}
