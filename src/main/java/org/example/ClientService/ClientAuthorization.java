package org.example.ClientService;

import org.example.ClientsDB;

public class ClientAuthorization implements Authorization {
    private String usernameOrEmail;
    private String password;
    private boolean isUsername = true;

    public void inputLogin(String usernameOrEmail) {
        if(Validation.validateEmail(usernameOrEmail)) {
            isUsername = false;
        }
        this.usernameOrEmail = usernameOrEmail;
    }

    public void inputPassword(String password) {
        this.password = password;
    }

    public Client authorizate() {
        if(usernameOrEmail == null || password == null) {
            throw new IllegalArgumentException("Недостаточно данных");
        }
        for (Client client : ClientsDB.getList()) {
            if (isUsername) {
                if (usernameOrEmail.equals(client.getUsername()) && password.equals(client.getPassword())) {
                    return client;
                }
            } else {
                if (usernameOrEmail.equals(client.getEmail()) && password.equals(client.getPassword())) {
                    return client;
                }
            }
        }
        throw new IllegalArgumentException("Некорректный ввод");
    }
}
