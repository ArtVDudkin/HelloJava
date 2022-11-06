package Architecture_DZ_3;

import java.util.ArrayList;
import java.util.List;

import Architecture_DZ_3.Interfaces.ICalcArea;
import Architecture_DZ_3.Interfaces.ICalcPerimetr;
import Architecture_DZ_3.Shapes.Circle;
import Architecture_DZ_3.Shapes.Rectangle;
import Architecture_DZ_3.Shapes.Shape;
import Architecture_DZ_3.Shapes.Square;
import Architecture_DZ_3.Shapes.Triangle;

public class Program {
    public static void main(String[] args) {
        
        double sumPerimetr = 0;
        double sumArea = 0;
        int mistCount = 0;
        
        List<Shape> shapes = new ArrayList<>();
        
        try {
            shapes.add(new Square(5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            shapes.add(new Square(-2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            shapes.add(new Rectangle(5,2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            shapes.add(new Rectangle(5,0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            shapes.add(new Triangle(3,4,5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            shapes.add(new Triangle(3,1,5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            shapes.add(new Circle(5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        for (Shape item : shapes) {
            if(item instanceof ICalcPerimetr) {
                sumPerimetr += item.calcPerimetr();
            } else {
                mistCount++;
            }
        }
        System.out.println("Sum of perimetrs of " + shapes.size() + " elements in array = " + sumPerimetr);
        if(mistCount > 0) {
            System.out.println("Warning: for " + mistCount + " figures in array perimetr can not be calculated!");
        }

        for (Shape item : shapes) {
            if(item instanceof ICalcArea) {
                sumArea += item.calcArea();
            }
        }
        System.out.println("Sum of areas of " + shapes.size() + " elements in array = " + sumArea);
    }
    
}
