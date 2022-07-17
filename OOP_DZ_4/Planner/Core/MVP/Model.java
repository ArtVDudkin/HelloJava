package Planner.Core.MVP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


import Planner.Core.Infrastructure.Notebook;
import Planner.Core.Models.Note;
import Planner.Core.Models.Note.Priority;

public class Model {

    private Notebook currentBook;
    private int currentIndex;
    private String path;

    public Model(String path) {
        currentBook = new Notebook();
        currentIndex = 0;
        this.path = path;
    }

    public Note currentNote() {
        if (currentIndex >= 0) {
            return currentBook.getTask(currentIndex);
        } else {
            // ???...
            return null;
        }
    }

    public void load() {
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String currLine = reader.readLine();
            while (currLine != null) {
                String[] nl = currLine.split(";");
                int id = Integer.parseInt(nl[0]);
                String date = nl[1];  
                String time = nl[2];
                String deadline = nl[3];
                String task = nl[4];
                String author = nl[5];
                Priority priority = Priority.toPriority(nl[6]);
                this.currentBook.add(new Note(id, date, time, deadline, task, author, priority));
                currLine = reader.readLine();
            }
            reader.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save() {
        try (FileWriter writer = new FileWriter(path, false)) {
            for (int i = 0; i < currentBook.count(); i++) {
                Note note = currentBook.getTask(i);
                writer.append(String.format("%d;%s;%s;%s;%s;%s;%s\n", note.id, note.date, note.time, note.deadline, note.task, note.author, note.priority));
            }
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void clear() {
        // for (var note : currentBook.getNotes()) {
        //     currentBook.remove(note);
        // }
        currentBook = new Notebook();
    }

    public Notebook currentBook() {
        return this.currentBook;
    }

    public int getCurrentIndex() {
        return this.currentIndex;
    }

    public void setCurrentIndex(int value) {
        this.currentIndex = value;
    }

    
}