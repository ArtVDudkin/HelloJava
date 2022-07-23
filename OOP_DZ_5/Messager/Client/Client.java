package Messager.Client;

import Messager.Server.IChat;
import Messager.Server.MessageModel;

public abstract class Client {
    private String name;
    protected IChat chatroom;
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IChat getChatroom() {
        return chatroom;
    }

    public void setChatroom(IChat chatroom) {
        this.chatroom = chatroom;
    }

    public void join(IChat chatroom) {
    }

    public void remove(IChat chatroom) {
    }
  
    public void printMessage(MessageModel msg) {
    }
  
    public void sendMsg(String text) {
    }

}