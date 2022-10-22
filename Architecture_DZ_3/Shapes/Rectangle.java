package Architecture_DZ_3.Shapes;

public class Rectangle extends Shape {

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) throws Exception {
        if (sideA <= 0 || sideB <= 0) {
            throw new RuntimeException("Error: both side length of rectangle must have positive value");
        }
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calcPerimetr() {
        return (sideA + sideB)*2;
    }

    @Override
    public double calcArea() {
        return sideA * sideB;
    }
    
}
