package SOLID.OCP.BadPractise;

public class Driver {

    public static void main(String args[]) {
        Rectangle rect = new Rectangle(10, 10);
        AreaCalculator.area(rect);

        Circle circle = new Circle(10);
        AreaCalculator.area(circle);

        Square sq = new Square(10);
        AreaCalculator.area(sq);

    }

}
