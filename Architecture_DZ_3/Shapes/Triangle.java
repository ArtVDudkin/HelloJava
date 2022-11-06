package Architecture_DZ_3.Shapes;

import Architecture_DZ_3.Interfaces.ICalcArea;
import Architecture_DZ_3.Interfaces.ICalcPerimetr;

public class Triangle extends Shape implements ICalcArea, ICalcPerimetr {

    private double sideA;
    private double sideB;
    private double sideC;
    
    public Triangle(double sideA, double sideB, double sideC) throws Exception {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0){
            throw new RuntimeException("Error: all side length of triangle must have positive value");
        }

        if ( (sideA + sideB < sideC) || (sideB + sideC < sideA) || (sideA + sideC < sideB) ) {
            throw new RuntimeException("Error: triangle with entered side length can not be created");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calcPerimetr() {
        return sideA + sideB + sideC;
    }

    @Override
    public double calcArea() {
        double halfPerimetr = calcPerimetr() / 2;
        return Math.sqrt(halfPerimetr*(halfPerimetr - sideA) * (halfPerimetr - sideB) * (halfPerimetr - sideC));
    }
    
}
