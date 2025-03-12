package patterns.creational.AbrtactFactory.Cracker;

public class ChocolateSpicyCraker extends Cracker{

	@Override
	public void dough() {
		System.out.println("Make dought from almond flour, add chocolates, paparika, and rest for 2 days");
	}

	@Override
	public void receipe() {
		System.out.println("Small circle and bake them at 450F for 30 mins");

	}
	@Override
	public String toString(){
		return "ChocolateSpicyCraker";
	}

}

