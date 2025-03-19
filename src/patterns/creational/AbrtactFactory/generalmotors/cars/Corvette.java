package patterns.creational.AbrtactFactory.generalmotors.cars;

public class Corvette extends SportsCar {

    public Corvette(CarBuilder builder) {
        super(builder);
        this.horsePower = builder.horsePower;
        this.seats = builder.seats;
        this.price = builder.price;
    }

    @Override
    public String toString() {
        return "Corvette has [horsePower=" + horsePower + ", seats=" + seats + ", price=" + price + "]";
    }

}
