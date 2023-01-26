package Final_work.Core.MVC.Controller;

import Final_work.Core.MVC.Model.Model;
import Final_work.Core.MVC.View.IView;

public class Controller {
    
    private Model model;
    private IView view;
    
    public Controller(Model model, IView view) {
        this.model = model;
        this.view = view;
    }
    
}
