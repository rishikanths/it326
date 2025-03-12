package patterns.structural.Decorator;

public interface Coffee {

	public void make();
	
	public double getPrice();
	
	public void addPrice(double d);
	
	public String getDescription();
}
