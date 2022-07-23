package Messager.Server;

import Messager.Client.Client;

public interface IReposirory {
    
    void add(Client user);

    void remove(Client user);

    Client getByName(String name);

    Client getById(int id);

    int getCount();
}
