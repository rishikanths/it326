package patterns.creational.Builder.config.Traditional;

public class Client {
    
    public static void main(String args[]){

        House myHouse = new House(112);
        try{
            myHouse.setBasement(1000);
            myHouse.setSqft(6000);
            myHouse.setPoarch(200);
            myHouse.setBathRooms(6);
        }catch(Exception e){
            System.err.println(e);
        }
        // At this point, myHouse object doesnt have 
        // the requested information for variable "bathRooms"
        System.out.println(myHouse.toString());
    }
    
}
