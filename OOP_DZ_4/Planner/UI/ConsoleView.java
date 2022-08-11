package Planner.UI;

import java.time.LocalDate;
import java.util.Scanner;

import Planner.Core.Infrastructure.Notebook;
import Planner.Core.MVP.View;


public class ConsoleView implements View {

    public ConsoleView() {
        System.out.print("\033[H\033[J");
    }

    public void print(Notebook currentBook) {
        System.out.println("Список задач на " + LocalDate.now());
        System.out.println("id   Date\t Time\tDeadline\tTask\t\t\t\t\tAuthor\t\t\t\tPriority");  
        for (var note : currentBook.getNotes()) {
            System.out.printf("%d    %s\t %s\t%s\t%s\t\t\t%s\t\t%s\n", 
                note.getId(), note.getDate(), note.getTime(), note.getDeadline(), note.getTask(), 
                note.getAuthor(), note.getPriority() );       
        };
        
    }

    @Override
    public void refresh() {
        System.out.print("\033[H\033[J");
    }

    @Override
    public void showMenu(int menu) {
        System.out.println(" 1 - prev  2 - next  3 - load  4 - save  5 - add  6 - remove  7 - sort by priority  8 - exit");
            
    }

    @Override
    public void setCurrIndex(int value) {
        System.out.printf("Current note: %d\n", value + 1);
    }

    private Scanner in = new Scanner(System.in);

    @Override
    public String inputText(String text) {
        System.out.printf("%s", text);
        return in.nextLine();
    }
    
}
