package org.example.Order;

import org.example.ProductServices.Product;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> clientProducts = new HashMap<>();

    public Map<Product, Integer> getClientProducts() {
        return clientProducts;
    }

    public int getTotalAmount() {
        int totalAmount = 0;
        for (Map.Entry<Product, Integer> entry : clientProducts.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            totalAmount += product.getProductPrice() * quantity;
        }
        return totalAmount;
    }
}
