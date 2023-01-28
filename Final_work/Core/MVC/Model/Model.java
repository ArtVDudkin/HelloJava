package Final_work.Core.MVC.Model;

import java.util.List;

import Final_work.Core.Infrastructure.Counter;
import Final_work.Core.Infrastructure.OutResourseException;
import Final_work.Core.Infrastructure.Repository;
import Final_work.Core.Models.Animal;

public class Model {

    private Repository repo;
    private int index;

    public Model() {
        repo = new Repository();
        this.index = -1;
    }

    public void add(Animal animal) {
        Counter ct = new Counter();
        try (ct) {
            ct.add();
        } catch (OutResourseException e) {
            e.showMessage();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // ct.add();                    this throws exception if command add() used with out resource-try 
        repo.add(animal);
        this.index++;
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
    
}
