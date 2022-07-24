package SaveDoc;

public class Doc {
    
    private String text = "";   // текст документа
    private int style = 1;      // стиль всего текста

    public void addBlock(String text) {
        this.text += text;
        System.out.printf("Добавлен блок: {%s}\n", text);
    }

    public void setStyle(int style) {
        if (this.style != style) {
            this.style = style;
        }
        System.out.printf("Установлен стиль: тип {%d}\n", style);
    }

    public void print() {
        System.out.printf("--- ПЕЧАТЬ ---\nСтиль: тип {%d}\nТекст: {%s}\n", style, text);
    }
   
    public DocMemento SaveState() {
        return new DocMemento(text, style);
    }

    public void restoreState(DocMemento memento) {
        text = memento.text;
        style = memento.style;
    }
}
