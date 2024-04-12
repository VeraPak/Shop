package org.example.ClientService;

public class ClientRegistration implements Registration {
    private String username;
    private String email;
    private String password;

    public ClientRegistration setUsername(String username) {
        this.username = username;
        return this;
    }

    public ClientRegistration setEmail(String email) {
        if (!Validation.validateEmail(email)) {
            throw new IllegalArgumentException("Неверный формат email");
        }
        this.email = email;
        return this;
    }

    public ClientRegistration setPassword(String password) {
        if (!Validation.validatePassword(password)) {
            throw new IllegalArgumentException("Неверный формат пароля, должен содержать буквы, цифры и знак");
        }
        this.password = password;
        return this;
    }

    public Client registrate(){
        if(username == null || email == null || password == null) {
            throw new IllegalArgumentException();
        }
        return new Client(username, email, password);
    }
}
