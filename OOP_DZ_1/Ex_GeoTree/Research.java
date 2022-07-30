package Ex_GeoTree;

import java.util.ArrayList;
import java.util.List;

public class Research {
    
    private List<Node> tree;
    
    public void Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }
    
    public List<Person> spend(Person pers, Node.Relationship relation) {
        var result = new ArrayList<Person>();
    
        for (Node item : tree) {
            if ( item.getPerson1().equals(pers)
                    && item.getRelation().equals(relation) ) {
                result.add(item.getPerson2() );
            }
        }
        return result;
    }

}
