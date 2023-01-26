package Final_work.Core.MVC.Model;

import java.util.List;

import Final_work.Core.Infrastructure.Repository;
import Final_work.Core.Models.Animal;

public class Model {

    private Repository repo;

    public Model() {
        repo = new Repository();
    }

    public void add(Animal animal) {
        repo.add(animal);
        System.out.println(animal.getCommands());
    }

    public void remove(Animal animal) {
        repo.remove(animal);
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
