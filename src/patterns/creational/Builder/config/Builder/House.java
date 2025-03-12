package patterns.creational.Builder.config.Builder;

public class House {

    private int num = 0;
    private int bedRooms = 0;
    private double bathRooms = 0.0;
    private int sqft = 0;
    private int poarch = 0;
    private Boolean pool = false;
    private int basement = 0;

    private House(HouseBuilder builder){
     
        num = builder.num;
        bathRooms = builder.bathRooms;
        bedRooms = builder.bedRooms;
        sqft = builder.sqft;
        poarch = builder.poarch;
        basement = builder.basement;
        pool = builder.pool;
    }

    public static class HouseBuilder{
        private int num = 0;
        private int bedRooms = 0;
        private double bathRooms = 0.0;
        private int sqft = 0;
        private int poarch = 0;
        private Boolean pool = false;
        private int basement = 0;

        public HouseBuilder(int num){
            this.num = num;
        }

        public HouseBuilder bedRooms(int n){
            this.bedRooms = n;
            return this;
        }
        public HouseBuilder bathRooms(double n){
            this.bathRooms = n;
            return this;
        }
        public HouseBuilder sqft(int n){
            this.sqft = n;
            return this;
        }
        public HouseBuilder poarch(int n){
            this.poarch = n;
            return this;
        }
        public HouseBuilder pool(Boolean n){
            this.pool = n;
            return this;
        }
        public HouseBuilder basement(int n){
            this.basement = n;
            return this;
        }
        public House build(){
            //process the attributes
            // Here the developer can hide the House object creation process
            // For example, the object creation might need other information (e.g., internal data, other process status, etc.) 
            // that the client need not know or have. 

            // The developer perform the required computation here and then create the object. 
            return new House(this);
        }
    }

    @Override
    public String toString() {
        return "House [num=" + num + ", bedRooms=" + bedRooms + ", bathRooms=" + bathRooms + ", sqft=" + sqft
                + ", poarch=" + poarch + ", pool=" + pool + ", basement=" + basement + "]";
    }
    
}