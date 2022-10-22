package Architecture_DZ_3.Shapes;

public class Square extends Shape {

    private double sideA;

    public Square(double sideA) throws Exception {
        if (sideA <= 0) {
            throw new RuntimeException("Error: side length of square must have positive value");
        }
        this.sideA = sideA;
    }

    @Override
    public double calcPerimetr() {
        return sideA * 4;
    }

    @Override
    public double calcArea() {
        return sideA * sideA;
    }
    
}
