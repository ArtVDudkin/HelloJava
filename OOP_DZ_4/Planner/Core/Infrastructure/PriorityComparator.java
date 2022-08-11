package Planner.Core.Infrastructure;

import java.util.Comparator;

import Planner.Core.Models.Note;

public class PriorityComparator implements Comparator<Note> {

    @Override
    public int compare(Note o1, Note o2) {
        return Integer.compare(getAssignedValue(o1), getAssignedValue(o2));
    }
    
    int getAssignedValue(Note note) {
        switch (note.getPriority()) {
            case LOW:
                return 2;
            case MEDIUM:
                return 1;
            case HIGH:
                return 0;
            default:
                return Integer.MAX_VALUE;
        }
    }
    
}
