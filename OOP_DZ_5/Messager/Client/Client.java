package Messager.Client;

import Messager.Server.IChat;
import Messager.Server.MessageModel;

public abstract class Client {
   
    abstract public String getName();

    abstract IChat getChatroom();

    abstract void join(IChat chatroom);

    abstract void remove(IChat chatroom);
  
    abstract public void printMessage(MessageModel msg);
  
    abstract void sendMsg(MessageModel text);

}