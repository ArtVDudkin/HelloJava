package Architecture_DZ_1.ModelElements;

public class Angle3D {

    private Integer degreeX;
    private Integer degreeY;
    private Integer degreeZ;

    public Angle3D() {
    }

    public Angle3D(Integer x, Integer y, Integer z) {
        this.degreeX = x % 360;         // На случай если введенное значение угла больше 360
        this.degreeY = y % 360;
        this.degreeZ = z % 360;
    }

    public void setAngle3D(Integer x, Integer y, Integer z) {
        this.degreeX = x % 360;
        this.degreeY = y % 360;
        this.degreeZ = z % 360;
    }

    public Integer getX() {
        return this.degreeX;
    }

    public Integer getY() {
        return this.degreeY;
    }

    public Integer getZ() {
        return this.degreeZ;
    }

    public void setX(Integer x) {
        this.degreeX = x % 360;
    }

    public void setY(Integer y) {
        this.degreeY = y % 360;
    }

    public void setZ(Integer z) {
        this.degreeZ = z % 360;
    }
    
}
