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
    public void showMenu(int menu) {
        // TODO Auto-generated method stub
        
    }

    
}
