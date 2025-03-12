package patterns.creational.AbrtactFactory;

import patterns.creational.AbrtactFactory.Cheese.Cheese;
import patterns.creational.AbrtactFactory.Cheese.Mozzarella;
import patterns.creational.AbrtactFactory.Cracker.Cracker;
import patterns.creational.AbrtactFactory.Cracker.CrispyCracker;

public class USAFactory extends AbstractFactory {

    @Override
    public Cheese getCheese() {
        return new Mozzarella();
    }

    @Override
    public Cracker getCracker() {
        return new CrispyCracker();
    }
    
}
