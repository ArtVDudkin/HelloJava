package Messager.Client;

import Messager.Server.IChat;
import Messager.Server.MessageModel;

public class User extends Client {
    private String name;
    protected IChat chatroom;

    public User(String name, IChat chatroom) {
        this.name = name;
        this.chatroom = chatroom;
        this.chatroom.appendClient(this);
    }

    public User(String name) {
        this.name = name;
    }
    
    @Override
    public void join(IChat chatroom) {
        this.chatroom = chatroom;
    }

    @Override
    public void remove(IChat chatroom) {
        this.chatroom.removeClient(this);
    }
    
    @Override
    public void printMessage(MessageModel msg) {
        System.out.printf("Чат %s: %s\n", this.name, msg.text);
    }
    
    @Override
    public void sendMsg(MessageModel text) {
        this.chatroom.sendMessage(text, this);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public IChat getChatroom() {
        return chatroom;
    }

}
