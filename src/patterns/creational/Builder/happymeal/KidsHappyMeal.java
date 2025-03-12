package patterns.creational.Builder.happymeal;


public class KidsHappyMeal extends HappyMealBuilder {

    @Override
    public void addToy() {
        meal.setToy("PAW Patrol Chase");
    }

    @Override
    public void addSide() {
        meal.setSide("French Fries");
    }

    @Override
    public void addMain() {
        meal.setMain("Cheese Burger");
    }

    @Override
    public void addDessert() {
        meal.setDessert("Icecream");
    }

    @Override
    public void addDrink() {
        meal.setDrink("Oragne Juice");
    }
	
   
}