package Final_work.Core.Infrastructure;

import java.util.ArrayList;
import java.util.List;

import Final_work.Core.Models.Animal;

public class Repository implements IRepository {

    private List<Animal> animals;

    public Repository() {
        this.animals = new ArrayList<>();
    }

    
}
