package Messager.Client;

import Messager.Server.IChat;
import Messager.Server.TextMessage;

public class Admin extends User {

    public Admin(String name) {
        super(name);
    }

    public Admin(String name, IChat chatroom) {
        super(name, chatroom);
    }

    public void kickUser(Client client, IChat chatroom) {
        this.chatroom.sendMessage(new TextMessage("Админ удалил пользователя " + client.getName() + " за плохое поведение!"), client);
        this.chatroom.removeClient(client);
    }
    
}
