package Architecture_DZ_1.ModelElements;

import java.util.ArrayList;
import java.util.List;

public class Polygon {
   
    private List<Point3D> points;

    public Polygon() {
        this.points = new ArrayList<>();
    }

    public Polygon(List<Point3D> points) {
        this.points = points;
    }

    public void addPoint(Point3D point) {
        points.add(point);
    }

    public void removePoint(Point3D point) {
        points.remove(point);
    }

    public List<Point3D> getPolygon() {
        return this.points;
    }

    public void editPolygon(Point3D point) {
        this.points.clear();
        this.points = points;
    }
    
}
