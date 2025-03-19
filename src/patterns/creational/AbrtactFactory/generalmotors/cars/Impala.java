package patterns.creational.AbrtactFactory.generalmotors.cars;

public class Impala extends Sedan {

    public Impala(CarBuilder builder) {
        super(builder);
    }

    @Override
    public String toString() {
        return "Impala has [horsePower=" + horsePower + ", seats=" + seats + ", price=" + price + "]";
    }

}
