package patterns.creational.AbrtactFactory;

import patterns.creational.AbrtactFactory.Factory.Location;

public class Client {

    public static void main(String args[]) {
		
		AbstractFactory c = Factory.getFactory(Location.USA);
		System.out.println(c.getCheese());
		System.out.println(c.getCracker());
	}
}
