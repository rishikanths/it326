package patterns.structural.Decorator;

public class Client {
	
	public static void main(String args[]) {
		
		Coffee myCoffee = new Latte(4.00);
		System.out.println(myCoffee.getDescription());
        System.out.println("Latte Cost -"+myCoffee.getPrice());
		
		
		myCoffee = new Caramel(myCoffee, 5.00);
		System.out.println(myCoffee.getDescription());
        System.out.println(" Latte 	Cost -"+myCoffee.getPrice());
		
		
		myCoffee= new Expresso(myCoffee, 3.00);
		System.out.println(myCoffee.getDescription());
        System.out.println(" Expresso Cost -"+myCoffee.getPrice());
		
	}
}
