package Ex2_GeoTree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    
    private String fullName;
    
    private List<Person> family = new ArrayList<>();
    
    public List<Person> getFamily() {
        return family;
    }
    
    public void appendToFamily(Person pers) {
        family.add(pers);
    }
    
    public Person(String fullName) {
        this.fullName = fullName;
    }
    
    @Override
    public String toString() {
        return fullName;
    }
}
