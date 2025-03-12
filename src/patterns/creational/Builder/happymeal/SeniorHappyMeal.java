package patterns.creational.Builder.happymeal;


public class SeniorHappyMeal extends HappyMealBuilder {

    @Override
    public void addToy() {
        meal.setToy("Yoda");
    }

    @Override
    public void addSide() {
        meal.setSide("Apples");
    }

    @Override
    public void addMain() {
        meal.setMain("Double Patty and Cheese Veg Burger");
    }

    @Override
    public void addDessert() {
        meal.setDessert("Apple Pie");
    }

    @Override
    public void addDrink() {
        meal.setDrink("Coffee");
    }
	
   
}