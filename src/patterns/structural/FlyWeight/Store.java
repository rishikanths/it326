package patterns.structural.FlyWeight;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class Store {

	private static Map<String, Furniture> shapes = new HashMap<>();
	
	public static Furniture getObject(Color c, String object, String name){
		if(shapes.containsKey(name))
			return shapes.get(name);
		else{
            Furniture temp = null;
            if (name.contains("Table")){
                temp = new DinningTable();
            }
            else{
                temp = new DiningChairs();
            }
            temp.setColor(c);
            shapes.put(name, temp);
            return temp;
		}
	}	
}
