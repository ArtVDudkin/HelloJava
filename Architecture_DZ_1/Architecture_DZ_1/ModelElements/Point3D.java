package Architecture_DZ_1.ModelElements;

public class Point3D {
    
    private Integer x;
    private Integer y;
    private Integer z;

    public Point3D() {
    }

    public Point3D(Integer x, Integer y, Integer z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setLocation(Integer x, Integer y, Integer z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Integer getX() {
        return this.x;
    }

    public Integer getY() {
        return this.y;
    }

    public Integer getZ() {
        return this.z;
    }

}
