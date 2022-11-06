package Architecture_DZ_3.Shapes;

import Architecture_DZ_3.Interfaces.ICalcArea;
import Architecture_DZ_3.Interfaces.ICalcCircleLengh;

public class Circle extends Shape implements ICalcArea, ICalcCircleLengh {
    
    private double radius;
    
    public Circle(double radius) {
        if (radius < 0) {
            throw new RuntimeException("Error: radius must have positive value");
        }
        this.radius = radius;
    }

    @Override
    public double calcCircleLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calcPerimetr() {
        return 0;
    }
    
}
