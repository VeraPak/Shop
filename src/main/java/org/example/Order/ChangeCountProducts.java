package org.example.Order;

import org.example.ShopService.FindProducts;
import org.example.ProductServices.Product;

import java.util.Map;

public class ChangeCountProducts {
    public static void deleteProduct(Map<Product, Integer> map, String productName, int count) {
        Product product = FindProducts.findByName(productName);

        if (!map.containsKey(product)) {
            throw new IllegalArgumentException("Продукта не найдено");
        }
        if (map.get(product) < count) {
            map.remove(product);
        } else {
            map.put(product, count);
        }
    }

    public static void clearCart(Map<Product, Integer> map) {
        map.clear();
    }
}
