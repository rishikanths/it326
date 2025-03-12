package patterns.creational.Builder.waiter;


public abstract class PizzaBuilder {
    
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void order(){
        pizza = new Pizza();
    }

    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();
}

