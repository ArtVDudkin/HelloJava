package Planner.Core.Models;

public class Note implements Comparable<Note> {
    public int id;
    public String date;     // попробовать заменить на LocalDate и LocalTime
    public String time;     //  ..есть трудности при чтении строки из файла и конвертации в эти типы
    public String deadline;
    public String task;
    public String author;
    public Priority priority;
    
    public enum Priority {
        HIGH, MEDIUM, LOW;

        public static Priority toPriority(String text) {
            switch (text) {
                case "HIGH":
                    return Priority.HIGH;
                case "MEDIUM":
                    return Priority.MEDIUM;
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
    
    // добавить возможность создания объектов с бОльшим количеством параметров
    // может использовать сложное поле..?

    @Override
    public int compareTo(Note o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        Note nt = (Note)obj;
        return this.id == nt.id
                && this.task == nt.task
        ;
    }
   
}
