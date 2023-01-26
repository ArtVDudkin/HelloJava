package Final_work.UI;

import java.time.LocalDate;
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
        System.out.println("1 - Пред.  2 - След.  3 - Новое животное  4 - Удалить животное  5 - Показать команды  6 - Новая команда  7 - Сохранить  8 - Выход");
            
    }

    @Override
    public void setCurrIndex(int value) {
        System.out.printf("Текущая строка: %d\n", value + 1);
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
        System.out.println("id   Вид\t Класс\t  Кличка\t Дата рождения");  
        for (Animal animal : animals.getAnimalList()) {
            System.out.printf("%d    %s\t %s\t%s\t%s\n", 
                1, animal.getClass().getSimpleName(), animal.getClass().getSuperclass().getSimpleName(), animal.getName(), animal.getBirthday());       
        };
        
    }


    @Override
    public void print(String value) {
        System.out.println(value);
        
    }
    
}
