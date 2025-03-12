package patterns.creational.AbrtactFactory.Cheese;

public class Ricotta extends Cheese{

	@Override
	public void prepareMilk() {
		System.out.println("Add Sheep milk");
	}

	@Override
	public void receipe() {
		System.out.println("Make Ricotta Scanta");

	}

	@Override
	public void age() {
		System.out.println("Age it for  1 year");
	}

	@Override
	public String toString(){
		return "Ricotta";
	}

}

