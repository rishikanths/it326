package patterns.creational.Builder.happymeal;

public class HappyMeal {
	private String toy = ""; 
	private String side = "";
   	private String main = "";
    private String dessert = "";
    private String drink = "";
    
    public void setToy(String toy) {
        this.toy = toy;
    }
    public void setSide(String side) {
        this.side = side;
    }
    public void setMain(String main) {
        this.main = main;
    }
    public void setDessert(String dessert) {
        this.dessert = dessert;
    }
    public void setDrink(String drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HappyMeal{");
        sb.append("toy=").append(toy);
        sb.append(", side=").append(side);
        sb.append(", main=").append(main);
        sb.append(", dessert=").append(dessert);
        sb.append(", drink=").append(drink);
        sb.append('}');
        return sb.toString();
    }

    
}