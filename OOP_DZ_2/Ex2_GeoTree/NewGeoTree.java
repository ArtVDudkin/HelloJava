package Ex2_GeoTree;

import java.util.LinkedList;
import java.util.List;

public class NewGeoTree implements ITree {
    
    private List<Node> newTree = new LinkedList<>();
    
    public List<Node> getTree() {
        return newTree;
    }
    
    @Override
    public void append(Person parent, Person children) {
        newTree.add(new Node(parent, Node.Relationship.PARENT, children));
        newTree.add(new Node(children, Node.Relationship.CHILDREN, parent));  
    }

    public List<Person> search(Person pers, Node.Relationship relation) {
    
        List<Person> result = new LinkedList<>();
    
        for (Node item : newTree) {
            if ( item.getPerson1().equals(pers)
                    && item.getRelation().equals(relation) ) {
                result.add(item.getPerson2());
            }
        }
        return result;
    }
}

