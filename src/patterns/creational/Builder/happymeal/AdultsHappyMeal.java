package patterns.creational.Builder.happymeal;


public class AdultsHappyMeal extends HappyMealBuilder {

    @Override
    public void addToy() {
        meal.setToy("Marvel or StarWars");
    }

    @Override
    public void addSide() {
        meal.setSide("French Fries");
    }

    @Override
    public void addMain() {
        meal.setMain("Double Patty and Cheese Burger");
    }

    @Override
    public void addDessert() {
        meal.setDessert("Icecream");
    }

    @Override
    public void addDrink() {
        meal.setDrink("Soda");
    }
	
   
}