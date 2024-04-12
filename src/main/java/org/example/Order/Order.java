package org.example.Order;

import org.example.ClientService.Client;
import org.example.Delivery.Delivery;
import org.example.Order.PaymentWays.Payment;
import org.example.ProductServices.Product;
import org.example.ProductsDB;

import java.util.Map;

public class Order {
    Client client;
    Delivery delivery;
    Payment payment;
    public Order(Client client, Delivery delivery){
        this.client = client;
        this.delivery = delivery;
        payment = new Payment();
    }
    public void makeOrder() {
        if(client.getCart().getClientProducts().isEmpty()) {
            throw new IllegalArgumentException("Корзина пуста");
        }
        if(client.getAddress() == null) {
            throw new IllegalArgumentException("Добавьте адресс в Личном Кабинете");
        }
        if(client.getPhoneNumber() == null) {
            throw new IllegalArgumentException("Добавьте номер телефона в Личном Кабинете");
        }

        removePaidProductsFromShop();
        payment.payByAppWallet(client.getWallet(), client.getCart().getTotalAmount());
        delivery.send(client.getPhoneNumber(), client.getAddress()); //todo - Dependency inversion principle
        ChangeCountProducts.clearCart(client.getCart().getClientProducts());

    }

    private void removePaidProductsFromShop(){
        for (Map.Entry<Product, Integer> entry : client.getCart().getClientProducts().entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            if (ProductsDB.getProductsMap().containsKey(product)) {
                int currentQuantity = ProductsDB.getProductsMap().get(product);
                ProductsDB.getProductsMap().put(product, currentQuantity - quantity);
            }
        }
    }
}
