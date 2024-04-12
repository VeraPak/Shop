package org.example.ShopService;

import org.example.ProductServices.Product;
import org.example.ProductsDB;

import java.util.LinkedList;
import java.util.List;

public class FindProducts {
    public static Product findByName(String name) {
        for(Product product : ProductsDB.getProductsMap().keySet()) {
            if (product.getProductName().contains(name)) {
                return product;
            }
        }
        throw new IllegalArgumentException("Продукт не найден");
    }

    public static List<Product> findByMaxPrice(int maxPrice) {
        List<Product> list = new LinkedList<>();
        for(Product product : ProductsDB.getProductsMap().keySet()) {
            if (product.getProductPrice() <= maxPrice) {
                list.add(product);
            }
        }
        if(list.isEmpty()) {
            throw new IllegalArgumentException("Продукты не найдены");
        }
        return list;
    }

    public static List<Product> findByMinPrice(int minPrice) {
        List<Product> list = new LinkedList<>();
        for(Product product : ProductsDB.getProductsMap().keySet()) {
            if (product.getProductPrice() >= minPrice) {
                list.add(product);
            }
        }
        if(list.isEmpty()) {
            throw new IllegalArgumentException("Продукты не найдены");
        }
        return list;
    }
}
