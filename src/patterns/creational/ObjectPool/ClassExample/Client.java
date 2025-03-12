package patterns.creational.ObjectPool.ClassExample;

public class Client {
    public static void main(String args[])
    {
        JetPool myPool = JetPool.initiatePool();
        PrivateJet myJet = myPool.rent();
        System.out.println(myJet.toString());
        
        myJet = myPool.rent();
        System.out.println(myJet.toString());
        
        myPool.done(myJet);
        
        myJet = myPool.rent();
        System.out.println(myJet.toString());
        
        myPool.done(myJet);
        myJet = myPool.rent();
        System.out.println(myJet.toString());

    }
}
