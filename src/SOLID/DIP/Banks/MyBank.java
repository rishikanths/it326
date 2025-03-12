package SOLID.DIP.Banks;
/**
 * The implementation of the Bank Abstraction. "MyBank" provides its implementation of "interest"
 */
public class MyBank extends Bank{
    private double time = 0.0;
    private double rate = 0.0;
    private double principle = 0.0;

    public MyBank(double p, double r, double t){
        this.time = t;
        this.principle = p;
        this.rate = r;
    }
    @Override
    public double interest() {
        rate = rate*2;
        return principle*time*(rate/100);
    }
    // Dont trust this bank as it promises TWICE the market interesr rate. Begining of Ponzi Scheme
}
