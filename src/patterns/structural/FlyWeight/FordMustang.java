package patterns.structural.FlyWeight;

import java.awt.Color;
import java.util.logging.Logger;

public class FordMustang extends RentalCar{
	
	private static final Logger logger = Logger.getLogger(FordMustang.class.getName());

	public FordMustang(){
		color = Color.BLUE;
		carName = "Ford Mustang";
		vin = "1FABP2732GF171121";
	}
	@Override
	public double renterDetails(String license, String address, int days) {
		this.renterLicense = license;
		this.renterAddress = address;
		this.rentalprice = days * (Math.random() * 100+1);
		this.rentalprice+=this.rentalprice*.15;
		return this.rentalprice;
	}
}
