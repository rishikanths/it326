package SOLID.OCP.GoodPractise.shape;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String args[]){

        Rectangle r = new Rectangle(10,20);
        Shape newShape = new MyShape(23.45);
        List<Shape> shapes = new ArrayList<>();
        shapes.add(r);
        shapes.add(new Rectangle(11,22));
        shapes.add(new Circle(10));
        shapes.add(new Rectangle(23,23));
        shapes.add(newShape);
        Shape s326 = new MyIT326Shape(10,10,110.3434);
        shapes.add(s326);
        AreaCalculator.area(shapes);  
    }
    
}
