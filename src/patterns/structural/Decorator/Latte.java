package patterns.structural.Decorator;

public class Latte extends Coffee {	
	public Latte(double p) {
		this.price = p;
	}
	
	@Override
	public void make() {
		System.out.println("Making a Latte");
	}
	
	@Override
	public double getPrice() {
		return price;
	}
	
	@Override
	public double addPrice(double d) {
		this.price +=d;
		return this.price;
	}

	@Override
	public String getDescription() {
		return "Formal Italian Latte";
	}

}
