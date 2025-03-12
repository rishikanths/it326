package patterns.creational.FactoryMethod.persistance;

import patterns.creational.FactoryMethod.persistance.FactoryMethod.PersistanceType;

public class Driver {
    
    public static void main(String[] args) {

        Persistance p = FactoryMethod.getPersistanceType(PersistanceType.CSV);
        p.save(null);
    }

}
