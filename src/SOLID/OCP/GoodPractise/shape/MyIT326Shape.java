package SOLID.OCP.GoodPractise.shape;

public class MyIT326Shape extends Shape {

    private double dimenionX  = 0.0;
    private double dimenionY = 0.0;
    private double dimenionZ = 0.0;

    public MyIT326Shape(double x, double y, double z){
        this.dimenionX = x;
        this.dimenionY = y;
        this.dimenionZ = z;
    }
    @Override
    public double area(){
        return dimenionX*dimenionZ/dimenionY;
    }
    
}
