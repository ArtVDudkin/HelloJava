package Ex2_GeoTree;

import java.util.ArrayList;

public class GeoTree implements interfaceTree {
    
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    @Override
    public void append(Person parent, Person children) {
        tree.add(new Node(parent, Node.Relationship.PARENT, children));
        tree.add(new Node(children, Node.Relationship.CHILDREN, parent));
    }

    public ArrayList<Person> search(Person pers, Node.Relationship relation) {
    
        ArrayList<Person> result = new ArrayList<Person>();
    
        for (Node item : tree) {
            if (item.person1.toString() == pers.toString()
                    && item.relation == relation) {
                result.add(item.person2);
            }
        }
        return result;
    }
}

