package Final_work.Core.MVC.View;

import Final_work.Core.Infrastructure.Repository;

public interface IView {
    
    void showMenu(int menu);
    void refresh();
    void setCurrIndex(int value);
    void printAnimals(Repository animals);
    void print(String value);
    String inputText(String text);

}
