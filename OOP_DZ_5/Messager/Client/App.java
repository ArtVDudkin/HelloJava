package Messager.Client;

import Messager.Server.DB;
import Messager.Server.MyChat;

public class App {
    public static void main(String[] args) {
        
        MyChat myChat = new MyChat(new DB());
        User user1 = new User("Петя", myChat);
        User user2 = new User("Маша", myChat);
        User user3 = new User("Саша", myChat);
        
        user1.sendMsg("Привет всем!");
        user2.sendMsg("ку-ку!");
        user3.sendMsg("Hi!");
        Admin admin = new Admin("Коля", myChat);

        admin.sendMsg("Как дела?");
        user3.sendMsg("Админ банан!");
        admin.kickUser(user3, myChat);
    }
}
