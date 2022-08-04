package Planner.Core.MVP;

import java.time.LocalDate;
import java.time.LocalTime;

import Planner.Core.Models.Note;
import Planner.Core.Models.Note.Priority;

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
        if (model.getCurrBook().count() > 0) {
            model.setCurrentIndex(0);
            view.print(model.getCurrBook());
            view.setCurrIndex(model.getCurrentIndex());
        }
    }

    // TODO добавить механизм добавления записей и проверку корректности...
    public void add() {
        int id = model.getCurrBook().count() + 1;
        String date = String.format("%02d.%02d.%04d", LocalDate.now().getDayOfMonth(), LocalDate.now().getMonthValue(), LocalDate.now().getYear());  
        String time = String.format("%02d:%02d", LocalTime.now().getHour(), LocalTime.now().getMinute());
        String deadline = view.inputText("Введите крайний срок: дд.мм.гггг: ");
        String task = view.inputText("Введите текст задачи: ");
        String author = view.inputText("Введите автора задачи: ");
        Priority priority = Priority.toPriority(view.inputText("Введите приоритет задачи (HIGH, MEDIUM, LOW): "));
        model.getCurrBook().add(new Note(id, date, time, deadline, task, author, priority));
        view.print(model.getCurrBook());
        view.setCurrIndex(model.getCurrentIndex());
    }

    public void remove() {
        if (model.getCurrBook().count() < 1) {
            model.setCurrentIndex(-1);
            view.print(model.getCurrBook());
            view.setCurrIndex(model.getCurrentIndex());
        } else {
            model.getCurrBook().remove(model.getCurrentIndex());
            model.setCurrentIndex(model.getCurrentIndex() - 1);
            if (model.getCurrentIndex() < 0)
                model.setCurrentIndex(0);
            view.print(model.getCurrBook());
            view.setCurrIndex(model.getCurrentIndex()); 
        }
    }

    public void saveToFile() {
        model.save();
    }

    public void next() {
        if (model.getCurrBook().count() > 0) {
            if (model.getCurrentIndex() < model.getCurrBook().count() -1) {
                model.setCurrentIndex(model.getCurrentIndex() + 1);
                view.print(model.getCurrBook());
                view.setCurrIndex(model.getCurrentIndex());                
            }
        }
    }

    public void prev() {
        if (model.getCurrBook().count() > 1) {
            if (model.getCurrentIndex() > 0) {
                model.setCurrentIndex(model.getCurrentIndex() - 1);
                view.print(model.getCurrBook());
                view.setCurrIndex(model.getCurrentIndex());
            }
        }
    }

    public void sortByPriority() {
        if (model.getCurrBook().count() > 1) {
            model.getCurrBook().sort();
            model.setCurrentIndex(0);
            view.print(model.getCurrBook());
            view.setCurrIndex(model.getCurrentIndex());
        }
    }
}
