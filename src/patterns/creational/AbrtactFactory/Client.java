package patterns.creational.AbrtactFactory;

import patterns.creational.AbrtactFactory.Factory.Location;

public class Client {

    public static void main(String args[]) {
		
		AbstractFactory c = Factory.getFactory(Location.USA);
		//USAFactory c1 =Factory.getFactory(Location.USA);
		c = Factory.getFactory(Location.HOME);
		System.out.println(c.getCheese());
		System.out.println(c.getCracker());
	}
}
