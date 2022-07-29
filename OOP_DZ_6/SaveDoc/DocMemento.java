package SaveDoc;

public class DocMemento {
    
    private String text;
    private int style;
    
    public DocMemento(String text, int style) {
        this.text = text;
        this.style = style;
    }

    public int getStyle() {
        return this.style;
    }

    public String getText() {
        return this.text;
    }
    
}
