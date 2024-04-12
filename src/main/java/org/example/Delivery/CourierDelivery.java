package org.example.Delivery;

public class CourierDelivery implements Delivery {
    @Override
    public void send(String phoneNumber, String address) {
        System.out.println("Заказ отправлен курьером по адресу" + address);
    }
}
