package SOLID.DIP.Banks;

/**
 * The implementation of the Bank Abstraction. "ISUBank" provides its implementation of "interest"
 */
public class ISUBank extends Bank{
    
    private double time = 0.0;
    private double rate = 0.0;
    private double principle = 0.0;

    public ISUBank(double p, double r, double t){
        this.time = t;
        this.principle = p;
        this.rate = r;
    }
    @Override
    public double interest(){
        rate = rate+.05;
        return principle*time*(rate/100);
    }

}
