package SOLID.OCP.GoodPractise.persist;

public class Driver {
    
    public static void main(String[] args) {

        Persistance p = new Database();
        p.save(null);
        p = new CSV("/data/test.csv");
        p.save(null);

    }

}
