package SOLID.OCP.BadPractise;
/*
 * This break the OCP. Everytime you add new shape (e.g., rhombus, triangle), you need to add/modify this code
 * to calculate the area of that shape.
 */
public class AreaCalculator {
    
    public static void area(Rectangle rect){
        System.out.println(rect.area());
    }

    public static void area(Circle cir){
        System.out.println(cir.area()); 
    }

    public static void area(Square sq){
        System.out.println(sq.area());
    }

}
