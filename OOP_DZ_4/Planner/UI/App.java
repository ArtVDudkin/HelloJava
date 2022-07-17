package Planner.UI;

import java.util.Scanner;

import Planner.Config;
import Planner.Core.MVP.Presenter;
import Planner.Core.MVP.View;

public class App {
    public static void buttonClick() {
        System.out.print("\033[H\033[J");   // очистить консоль
        View view = new ConsoleView();
        Presenter presenter = new Presenter(view, Config.pathDB);
        presenter.loadFromFile();

        try (Scanner in = new Scanner(System.in)) {

            while (true) {
                System.out.println(" 1 - prev  2 - next  3 - load  4 - save  5 - add  6 - remove  7 - exit");
                String key = in.next();
                System.out.print("\033[H\033[J");
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
                        presenter.next();
                        break;
                    case "6":
                        presenter.next();
                        break;
                    case "7":
                        System.exit(0);
                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }

    }
}
