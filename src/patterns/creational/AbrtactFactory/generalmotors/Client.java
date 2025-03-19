package patterns.creational.AbrtactFactory.generalmotors;

import patterns.creational.AbrtactFactory.generalmotors.cars.Car;

public class Client {

    public static void main(String args[]) {
		
		GMFactory c = ClientFactory.getFactory(ClientFactory.Location.CHEVY);
		Car.CarBuilder builder = new Car.CarBuilder().horsePower(1064)
		.seats(2).price(100000);
		Car myCar = c.createSportsCar(builder);
		System.out.println(myCar.toString());

		c = ClientFactory.getFactory(ClientFactory.Location.CADILLAC);
		builder = new Car.CarBuilder().horsePower(515)
		.seats(5).price(60000);
		myCar = c.createEV(builder);
		System.out.println(myCar.toString());

	}
}
