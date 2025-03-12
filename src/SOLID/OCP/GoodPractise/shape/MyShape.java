package SOLID.OCP.GoodPractise.shape;

public class MyShape extends Shape {

    private double dimension = 0.0;

    public MyShape(double dimension){
        this.dimension = dimension;
    }

    @Override
    public double area(){
        return 12.345544*dimension*(dimension*23/34);
    }
    
}
