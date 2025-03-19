package patterns.structural.FlyWeight;

import java.util.HashMap;
import java.util.Map;



public class RentalServiceCenter {
    public enum CarTypes{
		
        CORVETTE("Corvette"), MUSTANG("Mustang");
        public String name;
        CarTypes(String s) {
            this.name  = s;
        }
    }
	private static Map<String, RentalCar> cars = new HashMap<>();
	
	public static RentalCar getObject(CarTypes type){
		if(cars.containsKey(type.name))
			return cars.get(type.name);
		else{
            RentalCar temp = null;
            switch (type) {
                case CORVETTE -> { 
                    temp = new Corvette();
                    cars.put(type.name, temp);
                        }
                case MUSTANG -> { 
                    temp = new FordMustang();
                    cars.put(type.name, temp);
                        }
            }
            return temp;
		}
	}	
}
