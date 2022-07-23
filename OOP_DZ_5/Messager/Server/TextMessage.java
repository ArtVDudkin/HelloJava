package Messager.Server;

public class TextMessage extends MessageModel{

    public TextMessage() {
    }

    public TextMessage(String text) {
        super.text = text;
        super.id++;
    }
  
}
