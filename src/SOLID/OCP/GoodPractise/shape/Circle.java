package SOLID.OCP.GoodPractise.shape;
/*
 * Circle IS-A Shape. This shape will override the area method inherited from Shape and does the logic to 
 * calculate the area of Rectangle. 
 */
public class Circle extends Shape{

    private double radius =0.0;

    public Circle(double r){
        this.radius = r;
    }
    @Override
    public double area(){
        return Math.PI*radius*radius;
    }
}
