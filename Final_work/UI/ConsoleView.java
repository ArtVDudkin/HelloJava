package Final_work.UI;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import Final_work.Core.Infrastructure.Repository;
import Final_work.Core.MVC.View.IView;
import Final_work.Core.Models.Animal;

public class ConsoleView implements IView {
    
    public ConsoleView() {
        System.out.print("\033[H\033[J");
    }

    @Override
    public void refresh() {
        System.out.print("\033[H\033[J");
    }

    @Override
    public void showMenu(int menu) {
        System.out.println(" 1 - prev  2 - next  3 - add new animal  4 - remove animal  5 - show commands  6 - add new command  7 - save  8 - exit");
            
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

    @Override
    public void printAnimals(Repository animals) {
        System.out.println("Список животных в приюте на " + LocalDate.now());
        System.out.println("id   Type\t Class\t Name\t Birthday");  
        for (Animal animal : animals.getAnimalList()) {
            System.out.printf("%d    %s\t %s\t%s\t%s\n", 
                1, "cat", animal.getClass(),  animal.getBirthday());       
        };
        
    }


    @Override
    public void print(String value) {
        System.out.println(value);
        
    }
    
}
