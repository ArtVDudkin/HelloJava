package Messager.Client;

import Messager.Server.AudioMessage;
import Messager.Server.DB;
import Messager.Server.MyChat;
import Messager.Server.TextMessage;

public class App {
    public static void main(String[] args) {
        
        MyChat myChat = new MyChat(new DB());
        User user1 = new User("Петя", myChat);
        User user2 = new User("Маша", myChat);
        User user3 = new User("Саша", myChat);
        
        user1.sendMsg(new TextMessage("Привет всем!"));
        user2.sendMsg(new TextMessage("ку-ку!"));
        user3.sendMsg(new TextMessage("Hi!"));
        Admin admin = new Admin("Коля", myChat);

        admin.sendMsg(new TextMessage("Как дела?"));
        user3.sendMsg(new TextMessage("Админ банан!"));
        user3.sendMsg(new AudioMessage("Голосовое сообщение"));
        admin.kickUser(user3, myChat);
    }
}
