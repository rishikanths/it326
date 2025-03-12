package SOLID.OCP.GoodPractise.shape;

/*
 * Rectangle IS-A Shape. This shape will override the area method inherited from Shape and does the logic to 
 * calculate the area of Rectangle. 
 */
public class Rectangle extends Shape{
    
    private double width = 0.0;

    private double height = 0.0;

    public Rectangle(double w, double h){
        this.height = h;
        this.width = w;
    }

    @Override
    public double area(){
        return width*height;
    }
}
