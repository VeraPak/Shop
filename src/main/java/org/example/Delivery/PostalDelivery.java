package org.example.Delivery;

public class PostalDelivery implements Delivery {
    @Override
    public void send(String phoneNumber, String address) {
        System.out.println("Заказ отправлен по почте по адресу" + address);
    }
}
