package SaveDoc;

import java.util.Stack;

public class EditorHistory {

    private Stack history;

    public EditorHistory() {
        history = new Stack();
    }

    public void push(DocMemento memento) {
        //System.out.println("Сохранение документа.");
        history.push(memento);
    }

    public DocMemento pop() {
        System.out.println("Отмена последних действий.");
        return (DocMemento) history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}
