package Planner.UI;

import java.util.Scanner;

import Planner.Config;
import Planner.Core.MVP.Presenter;
import Planner.Core.MVP.View;

public class App {
    
    public static void buttonClick() {
        View view = new ConsoleView();
        Presenter presenter = new Presenter(view, Config.pathDB);
        presenter.loadFromFile();

        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                view.showMenu(0);
                String key = in.next();
                view.refresh();
                switch (key) {
                    case "1":
                        presenter.prev();
                        break;
                    case "2":
                        presenter.next();
                        break;
                    case "3":
                        presenter.loadFromFile();;
                        break;
                    case "4":
                        presenter.saveToFile();;
                        break;
                    case "5":
                        presenter.add();
                        break;
                    case "6":
                        presenter.remove();
                        break;
                    case "7":
                        presenter.sortByPriority();
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
