package patterns.structural.Bridge;

public abstract class Car {
   
    protected Engine myEngine = null;

    public Car(Engine e){
        this.myEngine = e;
    }

    protected abstract void build();

    public abstract String toString();
}
