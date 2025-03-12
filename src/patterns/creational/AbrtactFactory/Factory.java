package patterns.creational.AbrtactFactory;

public class Factory {
    
    public enum Location {
        USA, HOME
    }
    public static AbstractFactory getFactory(Location location) {
        
        AbstractFactory factory = null;
        switch (location) {
            case USA -> factory = new USAFactory();
            case HOME -> factory = new MyFactory();
        }
        return factory;
    }
}
