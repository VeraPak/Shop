package org.example.ClientService;

import org.example.Order.Cart;

public class Client {
    private String username; //обязательное при регистрации
    private String email; //обязательное при регистрации
    private String password; //обязательное при регистрации
    private String address; //можно добавить потом в лк, но без * нельзя оформить заказ
    private String phoneNumber; //можно добавить потом в лк, но без * нельзя оформить заказ
    private Wallet wallet; //можно добавить потом в лк, но без * нельзя оформить заказ
    private Bonuses bonuses; //бонусный счет
    private Cart cart; // корзина
    public Client(String username, String email, String password) {
        if (!Validation.validateEmail(email)) {
            throw new IllegalArgumentException("Неверный формат email");
        }
        if (!Validation.validatePassword(password)) {
            throw new IllegalArgumentException("Неверный формат пароля, должен содержать буквы, цифры и знак");
        }
        this.username = username;
        this.email = email;
        this.password = password;
        wallet = new Wallet();
        bonuses = new Bonuses();
        cart = new Cart();
    }

    void changeUsername(String username) {
        this.username = username;
    }

    void changeEmail(String email) {
        if (!Validation.validateEmail(email)) {
            throw new IllegalArgumentException("Неверный формат email");
        }
        this.email = email;
    }

    void changePassword(String password) {
        if (!Validation.validatePassword(password)) {
            throw new IllegalArgumentException("Неверный формат пароля, должен содержать буквы, цифры и знак");
        }
        this.password = password;
    }

    void changeAddress(String address) {
        this.address = address;
    }

    void changePhoneNumber(String phoneNumber) {
        if (!Validation.validatePhoneNumber(phoneNumber)) {
            throw new IllegalArgumentException("Неверный формат номера телефона");
        }
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public Cart getCart() {
        return cart;
    }

    @Override
    public String toString() {
        return "Клиент " +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
