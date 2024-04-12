package org.example;

import org.example.ClientService.Client;

import java.util.LinkedList;
import java.util.List;

public class ClientsDB {
    static List<Client> list = new LinkedList<>();

    public static void addClientToDB(Client client){
        for (Client nextClient : list) {
            if (nextClient.getEmail().contains(client.getEmail())) {
                throw new IllegalArgumentException("Клиент с данным Email существует");
            }
        }
        list.add(client);
    }
    
    public static List<Client> getList() {
        return list;
    }
}
