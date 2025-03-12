package patterns.creational.FactoryMethod.cheese;

public class Mozzarella extends Cheese{

	@Override
	public void prepareMilk() {
		System.out.println("Add Water Buffalo milk");
	}

	@Override
	public void receipe() {
		System.out.println("Make Mozzarella fior di latte");

	}

	@Override
	public void age() {
		System.out.println("Age it for 3 days");
	}

}

