package SOLID.OCP.BadPractise;

public class Square {
    
    private double side = 0.0;

    public Square(double s){
        this.side = s;
    }

    public double area(){
        return side*side;
    }
}
