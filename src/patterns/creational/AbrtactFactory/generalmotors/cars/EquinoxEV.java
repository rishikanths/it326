package patterns.creational.AbrtactFactory.generalmotors.cars;

public class EquinoxEV extends EVCar {

    public EquinoxEV(CarBuilder builder) {
        super(builder);
    }

    @Override
    public String toString() {
        return "EquinoxEV has [horsePower=" + horsePower + ", seats=" + seats + ", price=" + price + "]";
    }

}
