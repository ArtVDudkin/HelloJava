package SaveGame.UI;

import java.util.Scanner;

import SaveGame.Core.MVP.Presenter;
import SaveGame.Core.MVP.View;

public class App {
    public static void buttonClick() {
        System.out.print("\033[H\033[J");   // очистить консоль
        View view = new ConsoleView();
        Presenter presenter = new Presenter(view);
    
        try (Scanner inp = new Scanner(System.in)) {

            while (true) {
                view.print(" n - new game  s - save  l - load  e - exit");
                String key = inp.next();
                view.print("\033[H\033[J");
                switch (key) {
                    case "n":
                        presenter.newGame();
                        break;
                    case "s":
                        presenter.saveGame();
                        break;
                    case "l":
                        presenter.loadGame();
                        break;
                    case "e":
                        System.exit(0);
                    default:
                        if (presenter.getModel() != null) { // исли новая игра запущена, то передаем введенное значение в обработчик 
                            if (inp.hasNextInt()) {
                                presenter.getValue(inp);
                            }
                            System.out.println("Game started");
                        } else {
                            view.print("Такой команды нет");
                        }
                        
                        break;
                }
            }
        }

    }
}
