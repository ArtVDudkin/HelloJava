package Final_work.UI;


import Final_work.Core.MVC.Controller.Controller;
import Final_work.Core.MVC.Model.Model;


public class App {
    
    public static void buttonClick() {
       
    ConsoleView view = new ConsoleView();
    Controller controller = new Controller(new Model(), view);
    

    }
}
