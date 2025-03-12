package patterns.creational.ObjectPool.Object;

public class Client {

    public static void main(String args[]) {
        var pool = new ResourcePool();
        
        var obj1 = pool.checkOut();
        System.out.println(obj1);
        var obj2 = pool.checkOut();
        System.out.println(obj2);
        pool.checkIn(obj1);
        pool.checkIn(obj2);
        
        var obj4 = pool.checkOut();
        System.out.println(obj4);
        var obj5 = pool.checkOut();
        System.out.println(obj5);
        var obj6 = pool.checkOut();
        System.out.println(obj6);
        
    }
}
