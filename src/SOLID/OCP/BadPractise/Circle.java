package SOLID.OCP.BadPractise;

public class Circle{

    private double radius =0.0;

    public Circle(double r){
        this.radius = r;
    }
    
    public double area(){
        return Math.PI*radius*radius;
    }
}
