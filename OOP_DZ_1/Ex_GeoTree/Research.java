package Ex_GeoTree;

import java.util.ArrayList;

public class Research {
    
    ArrayList<Node> tree;
    
    public void Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }
    
    public ArrayList<Person> spend(Person p, Node.Relationship re) {
    
        var result = new ArrayList<Person>();
    
            // tree.forEach((t) -> {
            // if (t.p1.fullName == p.fullName
            // && t.re == re) {
            // result.add(t.p2);
            // }
            // });
    
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName
                    && t.re == re) {
                result.add(t.p2);
            }
        }
    
        return result;
    }

}

