package SOLID.DIP.Banks;

/**
 * The implementation of the Bank Abstraction. "BigBank" provides its implementation of "interest"
 */
public class BigBank extends Bank{

    private double time = 0.0;
    private double rate = 0.0;
    private double principle = 0.0;

    public BigBank(double p, double r, double t){
        this.time = t;
        this.principle = p;
        this.rate = r;
    }
    
    @Override
    public double interest(){
        return principle*time*(rate/100);
    }
}
