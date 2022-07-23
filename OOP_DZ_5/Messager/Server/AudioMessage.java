package Messager.Server;

public class AudioMessage extends MessageModel{
    
    private AudioMessage voice;
    private String title;

    public AudioMessage(String title) {
        super.text = title;
        super.id++;
    }

}
