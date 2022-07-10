package Ex2_GeoTree;

import java.util.LinkedList;

public class NewGeoTree implements interfaceTree {
    
    private LinkedList<Node> newTree = new LinkedList<Node>();
    
    public LinkedList<Node> getTree() {
        return newTree;
    }
    
    @Override
    public void append(Person parent, Person children) {
        newTree.add(new Node(parent, Node.Relationship.PARENT, children));
        newTree.add(new Node(children, Node.Relationship.CHILDREN, parent));  
    }

    public LinkedList<Person> search(Person pers, Node.Relationship relation) {
    
        LinkedList<Person> result = new LinkedList<Person>();
    
        for (Node item : newTree) {
            if (item.person1.toString() == pers.toString()
                    && item.relation == relation) {
                result.add(item.person2);
            }
        }
        return result;
    }
}

