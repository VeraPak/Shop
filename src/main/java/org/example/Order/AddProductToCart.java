package org.example.Order;

import org.example.ClientService.Client;
import org.example.ShopService.FindProducts;
import org.example.ProductServices.Product;
import org.example.ProductsDB;

public class AddProductToCart {
    public void addProductToCart(Client client, String productName, int count) {
        Product product = FindProducts.findByName(productName);

        if(ProductsDB.getProductsMap().get(product) == 0) {
            throw new IllegalArgumentException("К сожалению, продукта не осталось");
        }
        if(ProductsDB.getProductsMap().get(product) < count ) {
            throw new IllegalArgumentException("К сожалению, не хватает. Осталось" + count);
        }
        client.getCart().getClientProducts().put(product, count);
    }
}
