package SOLID.OCP.BadPractise;

public class Triangle{
    
    private double width;

    private double height;

    public Triangle(double w, double h){
        this.height = h;
        this.width = w;
    }

    public double area(){
        return .5*width*height;
    }
}
