package patterns.creational.AbrtactFactory.generalmotors.cars;

public abstract class Car {
    
    protected int horsePower;
    protected int seats;
    protected int price;

    public static class CarBuilder{
        protected int horsePower;
        protected int seats;
        protected int price;

        public CarBuilder(){}

        public CarBuilder horsePower(int power){
            this.horsePower = power;
            return this;
        }
        public CarBuilder seats(int seats){
            this.seats = seats;
            return this;
        }
        public CarBuilder price(int price){
            this.price = price;
            return this;
        }
    }    
}
