package patterns.creational.Builder.config.Builder;

public class Client {

    public static void main(String args[]){

        House myHouse = new House.HouseBuilder(5150).bedRooms(6).
            basement(2000).bathRooms(4).poarch(100).pool(true).build();

        System.out.println(myHouse.toString());
        /*
         * Another very good example 
         * https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java
         */
    }
    
}
