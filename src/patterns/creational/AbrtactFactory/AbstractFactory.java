package patterns.creational.AbrtactFactory;

import patterns.creational.AbrtactFactory.Cheese.Cheese;
import patterns.creational.AbrtactFactory.Cracker.Cracker;

public abstract class AbstractFactory {
    
    public abstract Cheese getCheese();

    public abstract Cracker getCracker();
}
