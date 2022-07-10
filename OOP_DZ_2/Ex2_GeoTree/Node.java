package Ex2_GeoTree;

public class Node {
    
    enum Relationship {
        PARENT,
        CHILDREN
    }

    public Node(Person person1, Relationship relation, Person person2) {
        this.person1 = person1;
        this.relation = relation;
        this.person2 = person2;
    }

    Person person1;
    Relationship relation;
    Person person2;

    @Override
    public String toString() {
        return String.format("<%s %s %s>", person1, relation, person2);
    }
}
