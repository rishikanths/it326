package patterns.structural.FlyWeight;

import patterns.structural.FlyWeight.RentalServiceCenter.CarTypes;

public class Client {
	
	public static void main(String args[]){
		
		RentalCar car = RentalServiceCenter.getObject(CarTypes.MUSTANG);
		car.renterDetails("S347864", "1500 Info Tech", 15);
		System.out.println(car.toString());	

		car = RentalServiceCenter.getObject(CarTypes.CORVETTE);
		car.renterDetails("SX3894", "1001 Chem Tech", 20);
		System.out.println(car.toString());	

		car = RentalServiceCenter.getObject(CarTypes.CORVETTE);
		car.renterDetails("TY237833", "500 Biotech Bay", 30);
		System.out.println(car.toString());	
	}
}
