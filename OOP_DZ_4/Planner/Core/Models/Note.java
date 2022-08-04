package Planner.Core.Models;

public class Note implements Comparable<Note> {
    private int id;
    private String date;     // попробовать заменить на LocalDate и LocalTime
    private String time;     //  ..есть трудности при чтении строки из файла и конвертации в эти типы
    private String deadline;
    private String task;
    private String author;
    private Priority priority;
    
    public enum Priority {
        HIGH, MEDIUM, LOW;

        public static Priority toPriority(String text) {
            switch (text) {
                case "HIGH":
                    return Priority.HIGH;
                case "high":
                    return Priority.HIGH;
                case "MEDIUM":
                    return Priority.MEDIUM;
                case "medium":
                    return Priority.MEDIUM;
                case "LOW":
                    return Priority.LOW;
                default:
                    return Priority.LOW;  
            }
        } 
    }

    public Note(Integer id, String date, String time, String deadline, String task, String author, Priority priority) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.deadline = deadline;
        this.task = task;
        this.author = author;
        this.priority = priority;
    }

    @Override
    public int compareTo(Note o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        Note nt = (Note)obj;
        return this.id == nt.id
                && this.task == nt.task;
    }

    public static int genId(int id) {
        return ++id;
    }

    public int getId() {
        return this.id;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String tm) {
        this.time = tm;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String dt) {
        this.date = dt;
    }

    public String getTask() {
        return this.task;
    }

    public void setTask(String newTask) {
        this.task = newTask;
    }

    public String getDeadline() {
        return this.deadline;
    }

    public void setDeadline(String dl) {
        this.deadline = dl;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Priority getPriority() {
        return this.priority;
    }

    public void setPriority(Priority prior) {
        this.priority = prior;
    }
   
}
