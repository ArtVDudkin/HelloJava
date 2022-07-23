package Messager.Server;

public class AudioMessage extends MessageModel{

    public AudioMessage(String title) {
        super.text = title;
        super.id++;
    }

}
