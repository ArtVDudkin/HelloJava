package Planner.Core.Infrastructure;

import java.util.List;
import Planner.Core.Models.Note;

public interface INotebook<T extends Note> {
    
    void add(T note);

    T getTask(int index);
    
    void remove(int index);

    boolean contains(int index);

    List<T> getNotes();

    int count();

}
