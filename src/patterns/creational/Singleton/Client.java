package patterns.creational.Singleton;

public class Client {

    public static void main(String args[]){

        President p = President.electPresident("Rishi");
        System.out.println(p);

        President p2 = President.electPresident("Rishi");
        System.out.println(p2);
    }
}
