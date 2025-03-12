package patterns.creational.Builder.config.Traditional;

public class House {

    private int num = 0;
    private int bedRooms = 0;
    private double bathRooms = 0.0;
    private int sqft = 0;
    private int poarch = 0;
    private Boolean pool = false;
    private int basement = 0;

    public House(){

    }
    public House(int num){
        this.num = num;
    }
    
    public House (int num, double bathRooms, int bedRooms, int sqft){
        this.num = num;
        this.bathRooms = bathRooms;
        this.bedRooms = bedRooms;
        this.sqft = sqft;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getBedRooms() {
        return bedRooms;
    }

    public void setBedRooms(int bedRooms) {
        this.bedRooms = bedRooms;
    }

    public double getBathRooms() {
        return bathRooms;
    }

    public void setBathRooms(double bathRooms) {
        this.bathRooms = bathRooms;
    }

    public int getSqft() {
        return sqft;
    }

    public void setSqft(int sqft) {
        this.sqft = sqft;
    }

    public int getPoarch() {
        return poarch;
    }

    public void setPoarch(int poarch) throws Exception {
        this.poarch = poarch;
        throw new UnsupportedOperationException();
    }

    public Boolean getPool() {
        return pool;
    }

    public void setPool(Boolean pool) {
        this.pool = pool;
    }

    public int getBasement() {
        return basement;
    }

    public void setBasement(int basement) {
        this.basement = basement;
    }
    @Override
    public String toString() {
        return "House [num=" + num + ", bedRooms=" + bedRooms + ", bathRooms=" + bathRooms + ", sqft=" + sqft
                + ", poarch=" + poarch + ", pool=" + pool + ", basement=" + basement + "]";
    }

    
    
}
