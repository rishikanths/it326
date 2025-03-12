package patterns.structural.FlyWeight;
import java.awt.Color;

public abstract class Furniture {
	
    Color color;
    protected int x,y,z;
   
    public Color getColor(){
        return color;
    }
    public void setColor(Color c){
        this.color = c;
    }
    
    public abstract void location(int a,int b ,int c);
}
