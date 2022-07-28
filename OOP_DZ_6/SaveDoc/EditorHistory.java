package SaveDoc;

import java.util.ArrayDeque;
import java.util.Deque;

public class EditorHistory {

    private Deque<DocMemento> history;
    private int idx;

    public EditorHistory() {
        history = new ArrayDeque<>();
        this.idx = -1;           // -1  = очередь пуста, иначе индекс элемента
    }

    public void changeIdx(int value) {
        this.idx += value;
    }

    public int getIdx() {
        return this.idx;
    }

    public void addLast(DocMemento memento) {
        System.out.println("Сохранение документа");
        history.addLast(memento);
        changeIdx(1);
        System.out.println(this.idx);
        while (history.size() != this.idx + 1) {
            history.pollFirst();
        }
    }

    public DocMemento undo() {
        System.out.println("Отмена последнего действия");
        history.addFirst(history.pollLast());
        changeIdx(-1);
        System.out.println(this.idx + "--" + history.size());
        return history.getLast();
    }

    public DocMemento redo() {
        System.out.println("Возврат последнего действия");
        history.addLast(history.pollFirst());
        changeIdx(1);
        System.out.println(this.idx + "--" + history.size());
        return history.getLast();
    }

    public int size() {
        return history.size();
    }
}
