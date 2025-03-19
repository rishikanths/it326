package patterns.structural.Decorator;

public  abstract class CoffeeAdons extends Coffee{
	protected Coffee baseCoffee;
	
	public CoffeeAdons(Coffee coffee) {
		this.baseCoffee = coffee;
	}
	@Override
	public void make() {
		baseCoffee.make();
	}
	@Override
	public double getPrice() {
		return baseCoffee.getPrice();
	}
	@Override
	public double addPrice(double d) {
		return this.baseCoffee.addPrice(d);
	}
	@Override
	public String getDescription() {
		return baseCoffee.getDescription();
	}
}
