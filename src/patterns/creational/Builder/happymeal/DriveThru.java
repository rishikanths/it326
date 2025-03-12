package patterns.creational.Builder.happymeal;

public class DriveThru {

    private HappyMealBuilder mealBuilder = null;

    public void setPizzaBuilder(HappyMealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public HappyMeal getHappyMeal() {
        return mealBuilder.getHappyMeal();
    }

    public void allSet() {
        mealBuilder.order();
        mealBuilder.addToy();
        mealBuilder.addMain();
        mealBuilder.addDessert();
        mealBuilder.addDrink();
        mealBuilder.addSide();
    }
}
