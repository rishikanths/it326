package patterns.creational.AbrtactFactory.generalmotors.cars;

public class CT4V extends SportsCar {

    public CT4V(CarBuilder builder) {
        super(builder);
    }

    @Override
    public String toString() {
        return "CT4V has [horsePower=" + horsePower + ", seats=" + seats + ", price=" + price + "]";
    }

}
