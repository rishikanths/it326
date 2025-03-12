package patterns.creational.Builder.happymeal;


public abstract class HappyMealBuilder {
    
    protected HappyMeal meal;

    public HappyMeal getHappyMeal() {
        return meal;
    }

    public void order(){
        meal = new HappyMeal();
    }

    public abstract void addToy();
    public abstract void addSide();
    public abstract void addMain();
    public abstract void addDessert();
    public abstract void addDrink();
}

