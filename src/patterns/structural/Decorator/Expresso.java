package patterns.structural.Decorator;

public class Expresso extends CoffeeAdons{
	private double price = 0.0;
	
	public Expresso(Coffee coffee, double d) {
		super(coffee);
		this.price = d;
	}
	@Override
	public void make() {
		addExpresso();
	}
	private void addExpresso() {
		System.out.println("Add Expresso");
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
		return "Adding Expresso";
	}
}
