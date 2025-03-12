package patterns.structural.Decorator;

public class Caramel extends CoffeeAdons{
	private double price = 0.0;
	public Caramel(Coffee coffee, double d) {
		super(coffee);
		this.price = d;
	}
	@Override
	public void make() {
		addCaramel();
	}
	private void addCaramel() {
		System.out.println("Add Caramel");
	}
	@Override
	public double getPrice() {
		addCost();
		return coffee.getPrice();
		
	}
	private void addCost() {
		this.coffee.addPrice(this.price);
	}
	@Override
	public String getDescription() {
		return addDescription();
	}
	private String addDescription() {
		return "Adding Caramel";
	}
}
