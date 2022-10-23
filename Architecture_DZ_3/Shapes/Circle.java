package Architecture_DZ_3.Shapes;

import Architecture_DZ_3.Interfaces.ICircle;

public class Circle extends Shape implements ICircle {
    
    private double radius;
    
    public Circle(double radius) {
        if (radius < 0) {
            throw new RuntimeException("Error: radius must have positive value");
        }
        this.radius = radius;
    }

    @Override
    public double calcPerimetr() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }
    
}
