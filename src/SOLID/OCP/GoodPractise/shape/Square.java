package SOLID.OCP.GoodPractise.shape;
/*
 * Square IS-A Shape. This shape will override the area method inherited from Shape and does the logic to 
 * calculate the area of Rectangle. 
 */
public class Square extends Shape{
    
    private double side = 0.0;

    public Square(double s){
        this.side = s;
    }
    @Override
    public double area(){
        return side*side;
    }
}
