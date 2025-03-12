package patterns.creational.Builder.happymeal;

public class Client {

	public static void main(String[] args) {
		
		HappyMealBuilder kidsMeal = new KidsHappyMeal();
	
		DriveThru helper = new DriveThru();

		helper.setPizzaBuilder(kidsMeal);
		helper.allSet();

		HappyMeal meal = helper.getHappyMeal();
		System.out.println(meal.toString());
	}

}

