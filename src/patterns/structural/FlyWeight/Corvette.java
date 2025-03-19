package patterns.structural.FlyWeight;

import java.awt.Color;
import java.util.logging.Logger;

public class Corvette extends RentalCar{

	private static final Logger logger = Logger.getLogger(Corvette.class.getName());
	public Corvette(){
		color = Color.RED;
		carName = "Corvette Stingray";
		vin = "1G1YC2D43N5109199";
	}
	@Override
	public double renterDetails(String license, String address, int days) {
		this.renterLicense = license;
		this.renterAddress = address;
		this.rentalprice = days * (Math.random() * 230+1);
		this.rentalprice+=this.rentalprice*.18;
		return this.rentalprice;
	}
}
