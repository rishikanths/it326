package SOLID.OCP.BadPractise;

public class Rectangle{
    
    private double width;

    private double height;

    public Rectangle(double w, double h){
        this.height = h;
        this.width = w;
    }

    public double area(){
        return width*height;
    }
}
