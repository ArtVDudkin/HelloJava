package Final_work.UI;

import java.time.LocalDate;
import java.util.Scanner;

import Final_work.Core.MVC.Controller.Controller;
import Final_work.Core.MVC.Model.Model;
import Final_work.Core.Models.Types.Dog;

public class App {
    
    public static void buttonClick() {
       
    ConsoleView view = new ConsoleView();
    Controller controller = new Controller(new Model(), view);
    //controller.loadFromFile();
    controller.addAnimal(new Dog("Grey", LocalDate.now()));

        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                view.showMenu(0);
                String key = in.next();
                view.refresh();
                switch (key) {
                    case "1":
                        controller.prev();
                        break;
                    case "2":
                        controller.next();
                        break;
                    case "3":
                        controller.add();
                        break;
                    case "4":
                        controller.remove();
                        break;
                    case "5":
                        controller.showCommands();
                        break;
                    case "6":
                        controller.addCommand();
                        break;
                    case "7":
                        controller.save();
                        break;
                    case "8":
                        System.exit(0);
                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }

    }
}
