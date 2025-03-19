package patterns.structural.Decorator;

public abstract class Coffee {

	protected double price = 0.0;
	public abstract void make();
	
	public abstract double getPrice();
	
	public abstract double addPrice(double d);
	
	public abstract String getDescription();
}
