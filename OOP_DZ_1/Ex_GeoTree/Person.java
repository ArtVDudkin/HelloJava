package Ex_GeoTree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    
    private String fullName;
    
    private List<Person> family = new ArrayList<>();
    
    public List<Person> getFamily() {
        return family;
    }
    
    public Person(String fullName) {
        this.fullName = fullName;
    }

    public void appendToFamily(Person p) {
        family.add(p);
    } 
    
    @Override
    public String toString() {
        return fullName;
    }
}
