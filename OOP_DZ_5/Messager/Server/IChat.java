package Messager.Server;

import Messager.Client.Client;

public interface IChat {
    
    void sendMessage(MessageModel mm, Client me);

    void appendClient(Client client);

    void removeClient(Client client);
}
