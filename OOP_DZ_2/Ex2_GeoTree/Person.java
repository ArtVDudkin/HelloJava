package Ex2_GeoTree;

import java.util.ArrayList;

public class Person {
    
    private String fullName;
    
    private ArrayList<Person> family = new ArrayList<>();
    
    public ArrayList<Person> getFamily() {
        return family;
    }
    
    public void appendToFamily(Person p) {
        family.add(p);
    }
    
    public Person(String fullName) {
        this.fullName = fullName;
    }
    
    @Override
    public String toString() {
        return fullName;
    }
}
