package patterns.creational.FactoryMethod.cheese;

public class Cheddar extends Cheese{

	@Override
	public void prepareMilk() {
		System.out.println("Add Raw milk and it must be ripened");
	}

	@Override
	public void receipe() {
		System.out.println("Make Cheddar");

	}

	@Override
	public void age() {
		System.out.println("Age it for 2-3 months");
	}

}

