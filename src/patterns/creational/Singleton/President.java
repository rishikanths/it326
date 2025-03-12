package patterns.creational.Singleton;


public class President{
    private String name="";
    private Integer identifier = null;
    private static  President myPresident = null;

    private President(String name){
        this.name = name;
        this.identifier = (int)(Math.random()*100);
    } 
    public static President electPresident(String name){
        if(myPresident == null)
            myPresident = new President(name);
        return myPresident;
    }
    @Override
    public String toString(){
        return "Current President's name is - "+name+ "with identifier - "+this.identifier;
    }
}
