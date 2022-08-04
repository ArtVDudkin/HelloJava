package Planner.Core.Infrastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Planner.Core.Models.Note;

public class Notebook {
    
    private List<Note> tasks;

    public Notebook() {
        tasks = new ArrayList<>();
    }

    // add new
    public void add(Note note) {
        if (!tasks.contains(note)) {
            tasks.add(note);
        }
    }

    // read
    public Note getTask(int index) {
        return contains(index) ? tasks.get(index) : null;
    }

    // delete
    public void remove(int index) {
        if (index != -1) {
            tasks.remove(tasks.get(index));
        }
    }

    private boolean contains(int index) {
        return tasks != null
                && tasks.size() > index;
    }

    public List<Note> getNotes() {
        return tasks.size() > 0 ? tasks : null;
    }

    public int count() {
        return tasks.size();
    }

    public void sort() {
        Collections.sort(getNotes(), new MyComparator());
    }

}
