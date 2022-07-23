package Messenger.Client;

import Messenger.Server.DB;
import Messenger.Server.MyChat;

public class App {
    public static void main(String[] args) {
        
        MyChat myChat = new MyChat(new DB());
        Client client1 = new Client("Петя", myChat);
        Client client2 = new Client("Маша", myChat);
        Client client3 = new Client("Саша", myChat);
        
        client1.sendMsg("Привет всем!");
        client2.sendMsg("ку-ку!");
        client3.sendMsg("Hi!");
        Client client4 = new Client("Коля", myChat);

        client4.sendMsg("Как дела?");
        client3.remove(myChat);
    }
}
