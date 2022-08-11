package SaveGame.Core.Game;

import java.util.Scanner;

import SaveGame.Core.MVP.Model;
import SaveGame.Core.MVP.Presenter;
import SaveGame.UI.ConsoleView;

import java.util.Random;;


public class Game {
    
    private Random rand = new Random();
    private int step;
    private int currentCandies;
    private int currPlayerIndex = 1;
    private Config cfg = new Config();
    private ConsoleView console;
    private String msg = "";
    private Presenter modelG;


    public void setCurrCandies(int value) {
        this.currentCandies = value;
    }

    public int getCurrCandies() {
        return currentCandies;
    }

    public void sendMsg(String text) {
        this.msg = text;
        console.print(msg);
    }

    public Game() {
        setCurrCandies(cfg.getInitCandies());
        
        while (currentCandies > 0) {
            if (currPlayerIndex == 0) {
                currPlayerIndex = 1;
            } else {
                currPlayerIndex = 0;
            }    
            currentCandies = nextMove();
        }
        
        if (currPlayerIndex == 0) {
            sendMsg("Ура, Вы забираете последнюю конфету! Поздравляем!");
        } else {
            sendMsg("И последнюю конфету забирает бот Никодим! В следующий раз Вам обязательно повезёт!");
        }
        sendMsg("Хотите, сыграем еще раз?");
    }
    
    public int checkStep(int step) {
        int step = model.checkData(new Scanner(System.in));
        // do {
        //     Scanner scanner = new Scanner(System.in);
        //     if (scanner.hasNextInt()) {
        //         step = scanner.nextInt();
        //         if (step <= 0) {
        //             sendMsg("Количество взятых конфет должно быть больше 1!");
        //         }
        //         if (step > cfg.getCandiesByStep()) {
        //             msg = "Не более " + cfg.getCandiesByStep() + " конфет!";
        //             sendMsg(msg);
        //         }
        //         if (step > currentCandies) {
        //             msg = "Всего конфет осталось " + currentCandies + "! Вы не можете взять больше! Попробуйте еще раз?";
        //             sendMsg(msg);
        //         }
        //     } else {  
        //         if (scanner.hasNext("s")) {
        //            // modelG.saveGame();
                    
        //             sendMsg("Game saved"); 
        //         } else if (scanner.hasNext("l")) {
        //            // modelG.loadGame();
        //             sendMsg("Game loaded");
        //         } else {
        //             sendMsg("Ошибка ввода!");
        //         }     
        //         msg = "Введите целое число от 1 до " + cfg.getCandiesByStep() + "!";
        //         sendMsg(msg);
        //         step = cfg.getCandiesByStep() + 1; // если введено не целое число, а что-то другое, то искуственно зацикливаем ввод значений
        //     }   
        // }
        // while(step < 1 || step > cfg.getCandiesByStep() || step > currentCandies);
        return step;
    }
    
    public int playerBot() {
        int step = currentCandies % (cfg.getCandiesByStep() + 1);
        if (step < 1) {
            step = rand.nextInt(cfg.getCandiesByStep()) + 1;     // от 1 до candiesByStep конфет
        }
        return step;
    }

    public int nextMove() {
        if (currPlayerIndex == 0) {
            msg = "Ваш ход! Возьмите не более " + cfg.getCandiesByStep() + " конфет. Всего конфет осталось: " + currentCandies;
            sendMsg(msg);
            modelG.getValue(new Scanner(System.in));// checkStep();
            step = checkStep(step);
        } else {
            step = playerBot();
            msg = "Бот Никодим забирает " + step + " конфет";
            sendMsg(msg);
        }
        return currentCandies - step;
    }

}
