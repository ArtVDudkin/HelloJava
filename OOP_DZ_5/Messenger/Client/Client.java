package Messenger.Client;

import Messenger.Server.IChat;
import Messenger.Server.MessageModel;

public class Client {
    private String name;
    private IChat chatroom;

    public String getName() {
        return name;
    }

    public Client(String name, IChat chatroom) {
        this.name = name;
        this.chatroom = chatroom;
        this.chatroom.appendClient(this);
    }
  
    public Client(String name) {
        this.name = name;
    }
  
    public void join(IChat chatroom) {
        this.chatroom = chatroom;
    }

    public void remove(IChat chatroom) {
        this.chatroom.removeClient(this);
    }
  
    public void printMessage(MessageModel msg) {
        System.out.printf("Чат %s: %s\n", name, msg.text);
    }
  
    public void sendMsg(String text) {
        var mm = new MessageModel(text);
         chatroom.sendMessage(mm, this);
    }

}