package Messager.Server;

import java.util.ArrayList;
import java.util.List;

import Messager.Client.Client;


public class DB implements IReposirory {
    
    private List<Client> users;

    public DB() {
        this.users = new ArrayList<>();
    }

    @Override
    public void add(Client user) {
        users.add(user);
    }

    @Override
    public void remove(Client user) {
        users.remove(user);
    }

    @Override
    public Client getByName(String name) {
        for (Client user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public Client getById(int id) {
        return users.get(id);
    }

    @Override
    public int getCount() {
        return users.size();
    }

}
