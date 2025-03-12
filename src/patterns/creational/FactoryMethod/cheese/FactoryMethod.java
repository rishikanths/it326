package patterns.creational.FactoryMethod.cheese;

public class FactoryMethod {

	public enum CheeseType{
		
		RICOTTA("Ricotta"), MOZZARELLA("Mozzarella"), CHEDDAR("Cheddar");
		public String name;
		CheeseType(String s) {
			this.name  = s;
		}
	}
	
	public static Cheese getCheese(CheeseType c) {
		
		if(c.equals(CheeseType.MOZZARELLA)) 
			return new Mozzarella();
		else if(c.equals(CheeseType.RICOTTA)) 
			return new Ricotta();
		else  
			return new Cheddar();
	}
}
