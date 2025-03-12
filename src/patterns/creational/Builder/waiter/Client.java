package patterns.creational.Builder.waiter;

public class Client {

	public static void main(String[] args) {
		
		
		Waiter waiter = new Waiter();
		
		PizzaBuilder hawaiiPizza = new HawaiiPizza();

		waiter.setPizzaBuilder(hawaiiPizza);
		waiter.constructPizza();

		Pizza pizza = waiter.getPizza();
		System.out.println(pizza.toString());
	}

}

