package patterns.creational.AbrtactFactory;

import patterns.creational.AbrtactFactory.Cheese.Cheese;
import patterns.creational.AbrtactFactory.Cheese.Ricotta;
import patterns.creational.AbrtactFactory.Cracker.ChocolateSpicyCraker;
import patterns.creational.AbrtactFactory.Cracker.Cracker;

public class MyFactory extends AbstractFactory {

    @Override
    public Cheese getCheese() {
        return new Ricotta();
    }

    @Override
    public Cracker getCracker() {
        return new ChocolateSpicyCraker();
    }
    
}
