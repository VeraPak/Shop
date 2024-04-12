package org.example.ProductServices;

import org.example.ProductsDB;

import java.util.*;

public class GetFeedback {
    private static Map<Product, List<String>> feedbackMap = new HashMap<>();
    public static void getFeedback(String message, Product product) {
        if (ProductsDB.getProductsMap().containsKey(product)) {
            if (feedbackMap.containsKey(product)){
                feedbackMap.get(product).add(message);
            }
            feedbackMap.put(product, new LinkedList<>(Collections.singletonList(message)));
        }
    }

    public static Map<Product, List<String>> getFeedbackMap() {
        return feedbackMap;
    }
}
