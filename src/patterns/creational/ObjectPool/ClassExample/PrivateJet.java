package patterns.creational.ObjectPool.ClassExample;

import java.util.Random;

public class PrivateJet {
    private String tailNum ="";
    private double range = 0.0;

    public PrivateJet(String tailNum){
        this.tailNum = tailNum;
        int seed = (int) (Math.random() * 10);
        this.range = new Random(seed).nextInt(4000);
    }

    @Override
    public String toString(){
        return "Jet:"+tailNum+" has "+range+" miles.";
    }
}
