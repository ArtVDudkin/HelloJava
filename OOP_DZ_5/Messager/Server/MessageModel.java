package Messager.Server;

public class MessageModel {
    
    public String text;
    int id;
  
    public MessageModel() {
    }
  
    public MessageModel(String text) {
        this.text = text;
        id++;
    }
}
