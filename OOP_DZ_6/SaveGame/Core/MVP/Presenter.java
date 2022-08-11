package SaveGame.Core.MVP;

import java.util.Scanner;

public class Presenter {
    
    private Model model;
    private View view;

    public Presenter(View view) {
        this.view = view;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public View getView() {
        return view;
    }
    public void setView(View view) {
        this.view = view;
    }

    public void newGame() {
        model = new Model();

    }

    public void saveGame() {
        if (getModel() == null) {
            model = new Model();
            model.save();
        } else {
            model.save();
            view.print("Игра сохранена");
        }    
    }

    public void loadGame() {
        if (getModel() != null) {
            model.load();
            view.print("Игра загружена");
        } else {
            view.print("Сохранения игры не найдены");
        }
    }

    

    public void getValue(Scanner value) {
        model.checkData(value);
    }

}
