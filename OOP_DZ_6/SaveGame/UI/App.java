package SaveGame.UI;

import java.util.Scanner;

import SaveGame.Core.Game.Game;
import SaveGame.Core.MVP.Model;
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
                        if (presenter.getModel() != null) {
                            int step = 0;
                            if (inp.hasNextInt()) {
                                step = Integer.parseInt(key);
                                System.out.println(step);
                            }
                            // do {
                                
                            //     // Scanner scanner = new Scanner(System.in);
                            //     // if (scanner.hasNextInt()) {
                            //     //     step = scanner.nextInt();
                            //     if (inp.hasNextInt()) {
                            //         step = inp.nextInt();
                                    String msg ="";
                                    if (step <= 0) {
                                        System.out.println("Количество взятых конфет должно быть больше 1!");
                                    }
                                    if (step > 28) {
                                        msg = "Не более " + 28 + " конфет!";
                                        System.out.println(msg);
                                    }
                                    if (step > 24) {
                                        msg = "Всего конфет осталось " + 24 + "! Вы не можете взять больше! Попробуйте еще раз?";
                                        System.out.println(msg);
                                    }
                            //     // } else {  
                            //     //     // if (scanner.hasNext("s")) {
                            //     //     //     modelG.saveGame();
                                        
                            //     //     //     sendMsg("Game saved"); 
                            //     //     // } else if (scanner.hasNext("l")) {
                            //     //     //     modelG.loadGame();
                            //     //     //     sendMsg("Game loaded");
                            //     //     // } else {
                            //     //          sendMsg("Ошибка ввода!");
                            //     //     }     
                            //         msg = "Введите целое число от 1 до " + 28 + "!";
                            //         System.out.println(msg);
                            //         step = 28 + 1; // если введено не целое число, а что-то другое, то искуственно зацикливаем ввод значений
                            //     }   
                            // }
                            // while(step < 1 || step > 28 || step > 24);
                            System.out.println("Game started");
                        } else {
                            System.out.println("Такой команды нет");
                        }
                        
                        break;
                }
            }
        }

    }
}
