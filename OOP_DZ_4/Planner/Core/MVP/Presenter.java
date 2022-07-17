package Planner.Core.MVP;

public class Presenter {
    
    private Model model;
    private View view;

    public Presenter(View view, String pathDb) {
        this.view = view;
        model = new Model(pathDb);
    }

    public void loadFromFile() {
        model.clear();              // очищаем текущую книгу, иначе она дополняется точно такими же записями
        model.load();
        if (model.currentBook().count() > 0) {
            model.setCurrentIndex(0);
            view.print(model.currentBook());
            view.setCurrIndex(model.getCurrentIndex());
        }
    }

    // TODO добавить механизм добавления записей и проверку корректности...
    public void add() {
        // model.currentBook().add(
        //         new Note());
    }

    public void remove() {
        if (model.currentBook().count() < 1) {
            model.setCurrentIndex(-1);
            view.print(model.currentBook());
            view.setCurrIndex(model.getCurrentIndex());
        } else {
            model.currentBook().remove(model.getCurrentIndex());
            model.setCurrentIndex(model.getCurrentIndex() - 1);
            if (model.getCurrentIndex() < 0)
                model.setCurrentIndex(0);
            view.print(model.currentBook());
            view.setCurrIndex(model.getCurrentIndex()); 
        }
    }

    public void saveToFile() {
        model.save();
    }

    public void next() {
        if (model.currentBook().count() > 0) {
            if (model.getCurrentIndex() + 1 < model.currentBook().count()) {
                model.setCurrentIndex(model.getCurrentIndex() + 1);
                view.print(model.currentBook());
                view.setCurrIndex(model.getCurrentIndex());                
            }
        }
    }

    public void prev() {
        if (model.currentBook().count() > 0) {
            if (model.getCurrentIndex() - 1 > -1) {
                model.setCurrentIndex(model.getCurrentIndex() - 1);
                view.print(model.currentBook());
                view.setCurrIndex(model.getCurrentIndex());
            }
        }
    }
}
