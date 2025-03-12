package patterns.structural.Decorator;

public class Latte implements Coffee {

	protected double price;
	
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
	public void addPrice(double d) {
		this.price +=d;
	}

	@Override
	public String getDescription() {
		return "Formal Italian Latte";
	}

}
