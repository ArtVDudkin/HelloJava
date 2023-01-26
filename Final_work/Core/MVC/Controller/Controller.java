package Final_work.Core.MVC.Controller;

import Final_work.Core.Models.Animal;
import Final_work.Core.Models.Types.Dog;

import java.time.LocalDate;

import Final_work.Core.Infrastructure.Counter;
import Final_work.Core.Infrastructure.OutResourseException;
import Final_work.Core.MVC.Model.Model;
import Final_work.Core.MVC.View.IView;

public class Controller {
    
    private Model model;
    private IView view;
    private int index;
    
    public Controller(Model model, IView view) {
        this.model = model;
        this.view = view;
        this.index = -1;
    }

    public void updateView() {
        view.printAnimals(model.getRepo());
    }

    public void next() {
        if (model.getCount() > 0) {
            if (index < model.getCount() -1) {
                index++;
                updateView();
                view.setCurrIndex(index);                
            }
        }
    }

    public void prev() {
        if (model.getCount() > 1 && index > 0) {
            index--;
            updateView();
            view.setCurrIndex(index);
        }
    }

    public void addAnimal() {
        model.add(new Dog("Grey", LocalDate.now()));
        index++;
        updateView();
        view.setCurrIndex(index);
        Counter ct = new Counter();
        try (ct) {
            ct.add();
        } catch (OutResourseException e) {
            e.showMessage();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // ct.add();                    this throws exception if command add() used with out resource-try 

    //     int id = model.getCurrBook().count() + 1;
    //     String date = String.format("%02d.%02d.%04d", LocalDate.now().getDayOfMonth(), LocalDate.now().getMonthValue(), LocalDate.now().getYear());  
    //     String time = String.format("%02d:%02d", LocalTime.now().getHour(), LocalTime.now().getMinute());
    //     String deadline = view.inputText("Введите крайний срок: дд.мм.гггг: ");
    //     String task = view.inputText("Введите текст задачи: ");
    //     String author = view.inputText("Введите автора задачи: ");
    //     Priority priority = Priority.toPriority(view.inputText("Введите приоритет задачи (HIGH, MEDIUM, LOW): "));
    //     model.getCurrBook().add(new Note(id, date, time, deadline, task, author, priority));
    //     view.print(model.getCurrBook());
    //     view.setCurrIndex(model.getCurrentIndex());
    }

    public void removeAnimal() {
        if (model.getCount() == 0) {
            index = 0;
            view.printAnimals(model.getRepo());
            view.setCurrIndex(index);
        } else {
            model.remove(model.getById(index));
            index--;
            if (index < 0) {
                index = -1;
            }
            view.printAnimals(model.getRepo());
            view.setCurrIndex(index);
        }
    }

    public void showCommands() {
        
    }

    public void addCommand() {
        
    }

    public void save() {
        
    }
    
}
