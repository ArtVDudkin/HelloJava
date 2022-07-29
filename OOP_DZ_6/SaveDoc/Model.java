package SaveDoc;

public abstract class Model {
    
    abstract void append(String text);
    
    abstract void print();

    abstract DocMemento saveState();

    abstract void restoreState(DocMemento memento);
}
