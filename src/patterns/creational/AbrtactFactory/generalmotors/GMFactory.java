package patterns.creational.AbrtactFactory.generalmotors;

import patterns.creational.AbrtactFactory.generalmotors.cars.Car.CarBuilder;
import patterns.creational.AbrtactFactory.generalmotors.cars.EVCar;
import patterns.creational.AbrtactFactory.generalmotors.cars.Sedan;
import patterns.creational.AbrtactFactory.generalmotors.cars.SportsCar;

public abstract class GMFactory {

    public abstract Sedan createSedan(CarBuilder builder);
    
    public abstract SportsCar createSportsCar(CarBuilder builder);

    public abstract EVCar createEV(CarBuilder builder);

    
}
