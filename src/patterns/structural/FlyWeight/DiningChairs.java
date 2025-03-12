package patterns.structural.FlyWeight;

public class DiningChairs extends Furniture{
    
    @Override
	public void location(int a, int b, int c) {
		System.out.println("Place the dining chair with color"+getColor().toString()
				+"at x -"+a+", y-"+b+", z-"+c);
	}
}
