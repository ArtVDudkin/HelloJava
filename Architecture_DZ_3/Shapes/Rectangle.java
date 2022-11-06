package Architecture_DZ_3.Shapes;

import Architecture_DZ_3.Interfaces.ICalcArea;
import Architecture_DZ_3.Interfaces.ICalcPerimetr;

public class Rectangle extends Shape implements ICalcArea, ICalcPerimetr {

    private double height;
    private double width;

    public Rectangle(double height, double width) throws Exception {
        if (height <= 0 || width <= 0) {
            throw new RuntimeException("Error: both side length of rectangle must have positive value");
        }
        this.height = height;
        this.width = width;
    }

    public Rectangle() {
    }

    public void setHeight(double value) {
        this.height = value;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double value) {
        this.width = value;
    }

    public double getWidth() {
        return this.width;
    }

    @Override
    public double calcPerimetr() {
        return (height + width)*2;
    }

    @Override
    public double calcArea() {
        return height * width;
    }
    
}
