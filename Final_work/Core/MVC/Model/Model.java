package Final_work.Core.MVC.Model;

import java.time.LocalDate;
import java.util.List;

import Final_work.Core.Infrastructure.AnimalFactory;
import Final_work.Core.Infrastructure.AnimalParcer;
import Final_work.Core.Infrastructure.BadParsingException;
import Final_work.Core.Infrastructure.CmdParser;
import Final_work.Core.Infrastructure.Counter;
import Final_work.Core.Infrastructure.OutResourseException;
import Final_work.Core.Infrastructure.Repository;
import Final_work.Core.Models.Animal;
import Final_work.Core.Models.Behavior.ILearnable;
import Final_work.Core.Models.Types.Dog;
import Final_work.Core.Models.Types.Hamster;

public class Model {

    private Repository repo;
    private int index;

    public Model() {
        repo = new Repository();
        this.index = -1;
    }

    public void add(String text) {
        Counter ct = new Counter();
        try (ct) {
            ct.add();
        } catch (OutResourseException e) {
            e.showMessage();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // ct.add();                  //  this throws exception if command add() used with out resource-try 
    
    //     String date = String.format("%02d.%02d.%04d", LocalDate.now().getDayOfMonth(), LocalDate.now().getMonthValue(), LocalDate.now().getYear());  
    //     String time = String.format("%02d:%02d", LocalTime.now().getHour(), LocalTime.now().getMinute());
    //     String deadline = view.inputText("Введите крайний срок: дд.мм.гггг: ");
    //     String task = view.inputText("Введите текст задачи: ");
    //     String author = view.inputText("Введите автора задачи: ");
    //     Priority priority = Priority.toPriority(view.inputText("Введите приоритет задачи (HIGH, MEDIUM, LOW): "));
    //     model.getCurrBook().add(new Note(id, date, time, deadline, task, author, priority));
        AnimalParcer anp = new AnimalParcer(text);
        AnimalFactory anFactory = AnimalFactory.getFactory();
        //Animal animal = new Dog("Grey", LocalDate.now());
        anp.parseData();
        System.out.println(anp.getName());
        System.out.println(anp.getType());
        if(anp.getName() != null && anp.getType() != null && anp.getBirthday() != null) {
            Animal animal = anFactory.createAnimal(anp.getName(), anp.getType(), anp.getBirthday());
            repo.add(animal);
            this.index++;
        }
    }

    public void remove(Animal animal) {
        if (repo.getCount() == 0) {
            this.index = -1;
        } else {
            repo.remove(animal);
            this.index--;
            if (this.index < 0) {
                this.index = -1;
            }
        }
    }

    public void next() {
        if (repo.getCount() > 0) {
            if (this.index < repo.getCount() -1) {
                this.index++;
            }
        }
    }

    public void prev() {
        if (repo.getCount() > 1 && this.index > 0) {
            this.index--;
        }
    }

    public int getIndex() {
        return this.index;
    }

    public Animal getByName(String name) {
        if(repo != null) {
            return repo.getByName(name);
        }
        return null;
    }

    public Animal getById(int id) {
        if(id >= 0 && id < repo.getCount()) {
            return repo.getById(id);
        }
        return null;
    }

    public Repository getRepo() {
        if(repo != null) {
            return repo;
        }
        return null;
    }

    public List<Animal> getAnimalList() {
        if(repo != null) {
            return repo.getAnimalList();
        }
        return null;
    }

    public int getCount() {
        if(repo != null) {
            return repo.getCount();
        }
        return 0; 
    }

    public void addCommandTo(Animal animal, String cmd) {
        CmdParser cp = new CmdParser(cmd);
        try {
            cp.parseData();
            if(animal instanceof ILearnable) {
                animal.addCommand(cp.makeCommand());
            } else {
                throw new RuntimeException("Это животное не может изучать новые команды");
            }
        } catch (BadParsingException e) {
            e.printStackTrace();
        }
    }
    
}
