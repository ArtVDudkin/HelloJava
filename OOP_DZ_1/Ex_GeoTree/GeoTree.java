package Ex_GeoTree;

import java.util.ArrayList;
import java.util.List;

public class GeoTree {
    
    private List<Node> tree = new ArrayList<>();

    public List<Node> getTree() {
        return tree;
    }

    public void append(Person parent, Person children) {
        tree.add(new Node(parent, Node.Relationship.PARENT, children));
        tree.add(new Node(children, Node.Relationship.CHILDREN, parent));
    }
}

