package Messenger.Server;

import Messenger.Client.Client;

public class MyChat implements IChat {
    
    private DB repo;

    public MyChat(DB currentRepo) {
        repo = currentRepo;
    }

    @Override
    public void sendMessage(MessageModel mm, Client me) {  
        for (int i = 0; i < repo.getCount(); i++) {
            var c = repo.getById(i);
            if (c.getName() != me.getName()) {
                c.printMessage(mm);
            }
        }
    }

    @Override
    public void appendClient(Client client) {
        System.out.println(">>> " + client.getName() + " добавлен в чат");
        repo.add(client);
    }

    @Override
    public void removeClient(Client client) {
        System.out.println(">>> " + client.getName() + " вышел из чата");
        repo.remove(client); 
    }

}
