package patterns.creational.AbrtactFactory.generalmotors.cars;

public class CT5 extends Sedan {

    public CT5(CarBuilder builder) {
        super(builder);
    }

    @Override
    public String toString() {
        return "CT5 has [horsePower=" + horsePower + ", seats=" + seats + ", price=" + price + "]";
    }

}
