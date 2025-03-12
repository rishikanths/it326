package patterns.structural.FlyWeight;

public class DinningTable extends Furniture{
    
    @Override
	public void location(int a, int b, int c) {
		System.out.println("Place the dining table with color"+getColor().toString()
				+"at x -"+a+", y-"+b+", z-"+c);
	}

}
