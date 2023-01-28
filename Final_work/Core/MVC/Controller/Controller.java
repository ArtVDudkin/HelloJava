package Final_work.Core.MVC.Controller;

import java.time.LocalDate;

import Final_work.Core.MVC.Model.Model;
import Final_work.Core.MVC.View.IView;
import Final_work.Core.Models.Command;
import Final_work.Core.Models.Types.Dog;

public class Controller {
    
    private Model model;
    private IView view;
    
    public Controller(Model model, IView view) {
        this.model = model;
        this.view = view;  
    }

    public void updateView() {
        view.printAnimals(model.getRepo());
    }

    public void next() {
        model.next();
        updateView();
        view.setCurrIndex(model.getIndex());                
    }

    public void prev() {
        model.prev();
        updateView();
        view.setCurrIndex(model.getIndex());
    }

    public void addAnimal() {
        model.add(new Dog("Grey", LocalDate.now()));
        updateView();
        view.setCurrIndex(model.getIndex());

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
        model.remove(model.getById(model.getIndex()));
        view.printAnimals(model.getRepo());
        view.setCurrIndex(model.getIndex());
    }

    public void showCommands() {
        
    }

    public void addCommand() {
        model.getById(model.getIndex()).addCommand(new Command("cmd", "descr"));
    }

    public void save() {
        
    }
    
}
