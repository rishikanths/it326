package patterns.creational.AbrtactFactory.generalmotors;

import patterns.creational.AbrtactFactory.generalmotors.cars.Car.CarBuilder;
import patterns.creational.AbrtactFactory.generalmotors.cars.Corvette;
import patterns.creational.AbrtactFactory.generalmotors.cars.EVCar;
import patterns.creational.AbrtactFactory.generalmotors.cars.EquinoxEV;
import patterns.creational.AbrtactFactory.generalmotors.cars.Impala;
import patterns.creational.AbrtactFactory.generalmotors.cars.Sedan;
import patterns.creational.AbrtactFactory.generalmotors.cars.SportsCar;

public class ChevyFactory extends GMFactory {

    @Override
    public Sedan createSedan(CarBuilder builder) {
        return new Impala(builder);
    }

    @Override
    public SportsCar createSportsCar(CarBuilder builder) {
        return new Corvette(builder);
    }

    @Override
    public EVCar createEV(CarBuilder builder) {
        return new EquinoxEV(builder);
    }
    
}
