package patterns.structural.FlyWeight;
import java.awt.Color;
public class Client {
	
	public static void main(String args[]){
		
		Furniture obj = Store.getObject(Color.RED,"Table","MyTable");
		obj.location(10, 10, 20);        
		
        obj = Store.getObject(Color.YELLOW,"Chair","Chair1");
		obj.location(10, 30, 40);		
		
        obj = Store.getObject(Color.YELLOW,"Chair","Chair2");
		obj.location(30, 40, 70);
        
        obj = Store.getObject(Color.YELLOW,"Chair","Chair1 ");
		obj.location(30, 10, 50);		
	}
}
