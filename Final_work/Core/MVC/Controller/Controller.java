package Final_work.Core.MVC.Controller;

import Final_work.Core.Models.Animal;
import Final_work.Core.MVC.Model.Model;
import Final_work.Core.MVC.View.IView;

public class Controller {
    
    private Model model;
    private IView view;
    
    public Controller(Model model, IView view) {
        this.model = model;
        this.view = view;
    }

    public void addAnimal(Animal animal) {
        model.add(animal);
        // Counter ct = new Counter();
        
        // try (ct) {
        //     ct.add();
        // } catch (MyException e) {
        //     e.showMessage();
        // }
        // ct.add();
    }

    public void removeAnimal(Animal animal) {
        model.remove(animal);
    }

    public void updateView() {
        view.printAnimals(model.getRepo());
    }

    public void next() {
    //     if (model.getCurrBook().count() > 0) {
    //         if (model.getCurrentIndex() < model.getCurrBook().count() -1) {
    //             model.setCurrentIndex(model.getCurrentIndex() + 1);
    //             view.print(model.getCurrBook());
    //             view.setCurrIndex(model.getCurrentIndex());                
    //         }
    //     }
    }

    public void prev() {
    //     if (model.getCurrBook().count() > 1) {
    //         if (model.getCurrentIndex() > 0) {
    //             model.setCurrentIndex(model.getCurrentIndex() - 1);
    //             view.print(model.getCurrBook());
    //             view.setCurrIndex(model.getCurrentIndex());
    //         }
    //     }
    }

    public void add() {
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

    public void remove() {
    //     if (model.getCurrBook().count() < 1) {
    //         model.setCurrentIndex(-1);
    //         view.print(model.getCurrBook());
    //         view.setCurrIndex(model.getCurrentIndex());
    //     } else {
    //         model.getCurrBook().remove(model.getCurrentIndex());
    //         model.setCurrentIndex(model.getCurrentIndex() - 1);
    //         if (model.getCurrentIndex() < 0)
    //             model.setCurrentIndex(0);
    //         view.print(model.getCurrBook());
    //         view.setCurrIndex(model.getCurrentIndex()); 
    //     }
    }

    public void showCommands() {
        
    }

    public void addCommand() {
        
    }

    public void save() {
        
    }
    
}
