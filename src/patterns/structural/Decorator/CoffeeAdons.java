package patterns.structural.Decorator;

public  abstract class CoffeeAdons implements Coffee{
	protected Coffee coffee;
	
	public CoffeeAdons(Coffee coffee) {
		this.coffee = coffee;
	}
	@Override
	public void make() {
		coffee.make();
	}
	@Override
	public double getPrice() {
		return coffee.getPrice();
	}
	@Override
	public void addPrice(double d) {
		this.coffee.addPrice(d);
	}
	@Override
	public String getDescription() {
		return coffee.getDescription();
	}
}
