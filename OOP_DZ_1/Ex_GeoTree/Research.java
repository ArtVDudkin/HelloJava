package Ex_GeoTree;

import java.util.ArrayList;

public class Research {
    
    ArrayList<Node> tree;
    
    public void Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }
    
    public ArrayList<Person> spend(Person pers, Node.Relationship relation) {
    
        var result = new ArrayList<Person>();
    
        for (Node t : tree) {
            if (t.person1.toString() == pers.toString()
                    && t.relation == relation) {
                result.add(t.person2);
            }
        }
    
        return result;
    }

}

