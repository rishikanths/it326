package patterns.creational.AbrtactFactory.Cracker;

public class CrispyCracker extends Cracker{

	@Override
	public void dough() {
		System.out.println("Make a all purpose dough and rest overnight");
	}

	@Override
	public void receipe() {
		System.out.println("Small circle and bake them at 450F for 30 mins");

	}
	@Override
	public String toString(){
		return "CrispyCracker";
	}

}

