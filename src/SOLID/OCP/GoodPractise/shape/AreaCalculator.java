package SOLID.OCP.GoodPractise.shape;

import java.util.List;
/*
 * This class will accept any object of TYPE Shape. We will call the area method, as we know, any class 
 * that extends/inherits ABSTRACT class shape, must provide a body to the "area" method. 
 * 
 * I can introduce an shape (e.g., MyIT326Shape.java or MyShape) and this code NEED NOT be modified to calculate
 * the area.
 */

public class AreaCalculator {
    
    public static void area(List<Shape> shapes){
        for(Shape s: shapes){
            /*
             * Polymorphism at play here. 
             * "s" is of TYPE Shape. At runtime, as you iterate thorough the list shapes, "s" will point
             * to different objects (rectangle, circle, etc.) of type. Based on what it is pointing to, 
             * s.area() will call the "area" method from those classes(rectangle, circle, etc.)
             */
            System.out.println(s.area());
        }
    }
}
