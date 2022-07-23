package Messenger.Server;

import Messenger.Client.Client;

public interface IChat {
    
    void sendMessage(MessageModel mm, Client me);

    void appendClient(Client client);

    void removeClient(Client client);
}
