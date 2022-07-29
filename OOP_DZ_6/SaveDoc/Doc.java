package SaveDoc;

public class Doc extends Model{
    
    private String text = "";   // текст документа
    private int style = 1;      // стиль всего текста

    @Override
    public void append(String text) {
        this.text += text;
        System.out.printf("Добавлен блок: {%s}\n", text);
    }

    public void setStyle(int style) {
        if (this.style != style) {
            this.style = style;
        }
        System.out.printf("Установлен стиль: тип {%d}\n", style);
    }

    @Override
    public void print() {
        System.out.printf("--- ПЕЧАТЬ ---\nСтиль: тип {%d}\nТекст: {%s}\n", style, this.text);
    }
   
    @Override
    public DocMemento saveState() {
        return new DocMemento(text, style);
    }

    @Override
    public void restoreState(DocMemento memento) {
        this.text = memento.getText();
        this.style = memento.getStyle();
    }
}
