package Messenger.Client;

import Messenger.Server.DB;
import Messenger.Server.MyChat;

public class App {
    public static void main(String[] args) {
        
        MyChat myChat = new MyChat(new DB());
        User user1 = new User("Петя", myChat);
        User user2 = new User("Маша", myChat);
        User user3 = new User("Саша", myChat);
        
        user1.sendMsg("Привет всем!");
        user2.sendMsg("ку-ку!");
        user3.sendMsg("Hi!");
        User user4 = new User("Коля", myChat);

        user4.sendMsg("Как дела?");
        user3.remove(myChat);
    }
}
