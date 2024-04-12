package org.example.ClientService;

public interface Registration {
    Registration setUsername(String username);
    Registration setEmail(String email);
    Registration setPassword(String password);
    Client registrate();

}