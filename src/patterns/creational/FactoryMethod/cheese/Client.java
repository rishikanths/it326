package patterns.creational.FactoryMethod.cheese;

import patterns.creational.FactoryMethod.cheese.FactoryMethod.CheeseType;

public class Client {

    public static void main(String args[]) {
		
		Cheese c = FactoryMethod.getCheese(CheeseType.RICOTTA); 

		c.prepareMilk();
		c.receipe();
		c.age();
	}
}
