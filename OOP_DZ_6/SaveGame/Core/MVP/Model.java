package SaveGame.Core.MVP;

import SaveGame.Core.Game.Game;

import java.util.Scanner;

import SaveGame.Core.Game.Config;
import SaveGame.Core.Saver.Caretaker;
import SaveGame.Core.Saver.Originator;

public class Model {

    private Game currentGame;
    private Config cfg;
    private Originator originator;
    private Caretaker caretaker;

    public Model() {
        currentGame = new Game();
        originator = new Originator();
        caretaker = new Caretaker();
        originator.setState(currentGame);
    }

    public void save() {
        originator.setState(currentGame);
        caretaker.setMemento(originator.saveState());
    }

    public void load() {
        if (caretaker.getMemento() != null) {
            originator.restoreState(caretaker.getMemento());
            currentGame = originator.getState();
        }
    }

    public void clear() {
        currentGame = new Game();
        originator = new Originator();
        caretaker = new Caretaker();
    }

    public Game getCurrentGame() {
        return this.currentGame;
    }

    public void checkData(Scanner value) {
        // do {
                                
                            //     // Scanner scanner = new Scanner(System.in);
                            //     // if (scanner.hasNextInt()) {
                            //     //     step = scanner.nextInt();
                            //     if (inp.hasNextInt()) {
                            //         step = inp.nextInt();
                                    // String msg ="";
                                    // if (step <= 0) {
                                    //     System.out.println("Количество взятых конфет должно быть больше 1!");
                                    // }
                                    // if (step > 28) {
                                    //     msg = "Не более " + 28 + " конфет!";
                                    //     System.out.println(msg);
                                    // }
                                    // if (step > 24) {
                                    //     msg = "Всего конфет осталось " + 24 + "! Вы не можете взять больше! Попробуйте еще раз?";
                                    //     System.out.println(msg);
                                    // }
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
    }
    
}