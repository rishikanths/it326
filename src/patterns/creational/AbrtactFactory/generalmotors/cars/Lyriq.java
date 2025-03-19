package patterns.creational.AbrtactFactory.generalmotors.cars;

public class Lyriq extends EVCar {

    public Lyriq(CarBuilder builder) {
        super(builder);
    }

    @Override
    public String toString() {
        return "Lyriq has [horsePower=" + horsePower + ", seats=" + seats + ", price=" + price + "]";
    }

}
