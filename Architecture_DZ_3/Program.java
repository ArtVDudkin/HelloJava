package Architecture_DZ_3;

import java.util.ArrayList;
import java.util.List;

import Architecture_DZ_3.Shapes.Circle;
import Architecture_DZ_3.Shapes.Rectangle;
import Architecture_DZ_3.Shapes.Shape;
import Architecture_DZ_3.Shapes.Square;
import Architecture_DZ_3.Shapes.Triangle;

public class Program {
    public static void main(String[] args) {
        
        double sumPerimetr = 0;
        double sumArea = 0;
        
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
            sumPerimetr += item.calcPerimetr();
        }
        System.out.println("Sum of perimetrs of "+ shapes.size() +" elements in array = " + sumPerimetr);

        for (Shape item : shapes) {
            sumArea += item.calcArea();
        }
        System.out.println("Sum of areas of " + shapes.size() + " elements in array = " + sumArea);
    }
    
}
