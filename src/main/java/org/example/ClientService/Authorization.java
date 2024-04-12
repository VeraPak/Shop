package org.example.ClientService;

public interface Authorization {
    void inputLogin(String login);
    void inputPassword(String password);
    Client authorizate();
}
