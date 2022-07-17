package Planner.UI;

import Planner.Core.Infrastructure.Notebook;
import Planner.Core.MVP.View;


public class ConsoleView implements View {

    public ConsoleView() {
        //    
    }

    public void print(Notebook currentBook) {
        for (var note : currentBook.getNotes()) {
            System.out.printf("%d\t%s\t%s\t%s\t%s\t%s\t%s\n", note.id, note.date, note.time, note.deadline, note.task, note.author, note.priority);       
        };
    }
    
    @Override
    public int getCurrIndex() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public void setCurrIndex(int value) {
        System.out.printf("Current note: %d\n", value);
        
    }
    
}
