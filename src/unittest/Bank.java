package unittest;

public class Bank{

    private double checkingBal = 0.0;

    public Bank(double initBal){
        this.checkingBal = initBal;
    }

    public double deposit(double amt){
        if (amt<0){
            throw new IllegalArgumentException();
        }
        this.checkingBal+=amt;
        return this.checkingBal;
    }

    public double withdrawal(double val){
        if(val > checkingBal){
            throw new IllegalArgumentException();
        }
        this.checkingBal-= val;
        return this.checkingBal;
    }
}