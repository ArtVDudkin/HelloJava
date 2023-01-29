package Final_work.Core.MVC.Controller;

import Final_work.Core.MVC.Model.Model;
import Final_work.Core.MVC.View.IView;
import Final_work.Core.Models.Command;

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
        model.add();
        updateView();
        view.setCurrIndex(model.getIndex());
    }

    public void removeAnimal() {
        model.remove(model.getById(model.getIndex()));
        view.printAnimals(model.getRepo());
        view.setCurrIndex(model.getIndex());
    }

    public void showCommands() {
        view.printCommands(model.getById(model.getIndex()));
    }

    public void addCommand() {
        model.getById(model.getIndex()).addCommand(new Command("cmd", "descr"));
    }

    public void save() {
        
    }
    
}
