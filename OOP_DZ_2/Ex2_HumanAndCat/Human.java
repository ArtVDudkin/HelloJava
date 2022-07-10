package Ex2_HumanAndCat;

import java.util.ArrayList;

public class Human {
    
    private ArrayList<Animal> myPets;

    public Human(Animal... args) {
        myPets = new ArrayList<Animal>();
    }

    public void addPet(Animal... args) {
        for (Animal pet : args) {
            myPets.add(pet);
        }
    }

    public void delPet(Animal pet) {
        myPets.remove(pet);
    }

    public String callPet(Animal animal, String value) {
        return String.format("human: calls %s: %s", animal.getAnimalName(), value);
    }

    public String callAllPets(String value) {
        StringBuilder res = new StringBuilder();
        res.append("human: " + value + "\n");
        for (Animal pet : myPets) {
            res.append(pet.listenHuman(value) + "\n");
        }
        return res.toString();
    }

    public String touchAnimal(Animal animal) {
        return "human: touch " + animal.getAnimalName();
    }

    public ArrayList<Animal> getMyPets() {
        return myPets;
    }

}
