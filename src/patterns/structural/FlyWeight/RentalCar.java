package patterns.structural.FlyWeight;
import java.awt.Color;

public abstract class RentalCar {
	
    //Intrinsic Data
    protected Color color;
    protected String carName;
    protected String vin;
    //Extrinsic Data
    protected String renterLicense;
    protected String renterAddress;
    protected double rentalprice;
   
    public abstract double renterDetails(String license, String address, int days);

    @Override
    public String toString() {
        return "RentalCar [color=" + color + ", carName=" + carName + ", vin=" + vin + ", renterLicense="
                + renterLicense + ", renterAddress=" + renterAddress + ", rentalprice=" + rentalprice + "]";
    }
    
    

    
}
