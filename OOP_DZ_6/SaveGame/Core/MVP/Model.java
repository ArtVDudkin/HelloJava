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
        int step = 0;
        String msg ="";
        do {           
            // Scanner scanner = new Scanner(System.in);
            if (value.hasNextInt()) {
                step = value.nextInt();            
                
                if (step <= 0) {
                    System.out.println("Количество взятых конфет должно быть больше 1!");
                }
                if (step > cfg.getCandiesByStep()) {
                    msg = "Не более " + cfg.getCandiesByStep() + " конфет!";
                    System.out.println(msg);
                }
                if (step > currentGame.getCurrCandies()) {
                    msg = "Всего конфет осталось " + currentGame.getCurrCandies() + "! Вы не можете взять больше! Попробуйте еще раз?";
                    System.out.println(msg);
                }

                } else {
                    System.out.println("Ошибка ввода!");
                }     
                msg = "Введите целое число от 1 до " + cfg.getCandiesByStep() + "!";
                System.out.println(msg);
                step = cfg.getCandiesByStep() + 1; // если введено не целое число, а что-то другое, то искуственно зацикливаем ввод значений
              
        }
        while(step < 1 || step > cfg.getCandiesByStep() || step > currentGame.getCurrCandies());
    }
    
}