package Messager.Client;

import Messager.Server.IChat;
import Messager.Server.MessageModel;
import Messager.Server.TextMessage;

public class User extends Client {

    public User(String name, IChat chatroom) {
        setName(name);
        setChatroom(chatroom);
        this.chatroom.appendClient(this);
    }

    
    public User(String name) {
        super.setName(name);
    }
  
    public void join(IChat chatroom) {
        super.setChatroom(chatroom);
    }

    public void remove(IChat chatroom) {
        this.chatroom.removeClient(this);
    }
  
    public void printMessage(MessageModel msg) {
        System.out.printf("Чат %s: %s\n", super.getName(), msg.text);
    }
  
    public void sendMsg(MessageModel text) {
        //var mm = new TextMessage(text);
        this.chatroom.sendMessage(text, this);
    }
}
