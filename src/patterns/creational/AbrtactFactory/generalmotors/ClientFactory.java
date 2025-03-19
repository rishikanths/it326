package patterns.creational.AbrtactFactory.generalmotors;

public class ClientFactory {
    
    public enum Location {
        CHEVY, CADILLAC
    }
    
    public static GMFactory getFactory(Location location) {
        
        GMFactory factory = null;
        switch (location) {
            case CHEVY -> factory = new ChevyFactory();
            case CADILLAC -> factory = new CadillacFactory();
        }
        return factory;
    }
}
