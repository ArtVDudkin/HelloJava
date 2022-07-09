package Ex_GeoTree;

import java.util.ArrayList;

public class GeoTree {
    
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person parent, Person children) {
        tree.add(new Node(parent, Node.Relationship.parent, children));
        tree.add(new Node(children, Node.Relationship.children, parent));
    }
}

