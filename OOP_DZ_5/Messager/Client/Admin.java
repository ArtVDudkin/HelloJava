package Messager.Client;

import Messager.Server.IChat;

public class Admin extends User {

    public Admin(String name) {
        super(name);
    }

    public Admin(String name, IChat chatroom) {
        super(name, chatroom);
    }

    public void kickUser(Client client, IChat chatroom) {
        this.chatroom.removeClient(client);
    }
    
}
