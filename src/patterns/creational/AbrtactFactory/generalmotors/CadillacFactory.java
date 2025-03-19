package patterns.creational.AbrtactFactory.generalmotors;

import patterns.creational.AbrtactFactory.generalmotors.cars.CT4V;
import patterns.creational.AbrtactFactory.generalmotors.cars.CT5;
import patterns.creational.AbrtactFactory.generalmotors.cars.Car.CarBuilder;
import patterns.creational.AbrtactFactory.generalmotors.cars.EVCar;
import patterns.creational.AbrtactFactory.generalmotors.cars.Lyriq;
import patterns.creational.AbrtactFactory.generalmotors.cars.Sedan;
import patterns.creational.AbrtactFactory.generalmotors.cars.SportsCar;

public class CadillacFactory extends GMFactory {

   @Override
    public Sedan createSedan(CarBuilder builder) {
        return new CT5(builder);
    }

    @Override
    public SportsCar createSportsCar(CarBuilder builder) {
        return new CT4V(builder);
    }

    @Override
    public EVCar createEV(CarBuilder builder) {
        return new Lyriq(builder);
    }
}
