package effectiveJava.item2;
//Instead of making the desired object directly,
//the client calls a constructor (or static factory) with all of the required parameters
//and gets a builder object. Then the client calls setter-like methods on the builder
//object to set each optional parameter of interest. Finally, the client calls a
//parameterless build method to generate the object, which is typically
//immutable. The builder is typically a static member class (Item 24) of the class it
//builds.
public class House {
    private final String adressName;
    private final int adressNumber;
    private final int amountWindows;
    private final int amountDoors;

    @Override
    public String toString() {
        return "House{" +
                "adressName='" + adressName + '\'' +
                ", adressNumber=" + adressNumber +
                ", amountWindows=" + amountWindows +
                ", amountDoors=" + amountDoors +
                '}';
    }

    private House(Builder builder) {
        this.adressName = builder.adressName;
        this.adressNumber = builder.adressNumber;
        this.amountWindows = builder.amountWindows;
        this.amountDoors = builder.amountDoors;
    }

    public static class Builder{
        private String adressName;
        private int adressNumber;
        private int amountWindows = 0;
        private int amountDoors = 0;

        public Builder(String adressName, int adressNumber){
            this.adressName = adressName;
            this.adressNumber = adressNumber;
        }

        public House build() {
            return new House(this);
        }

        public Builder adressName(String add){
            this.adressName = add;
            return this;
        }

        public Builder adressNumber(int adressNumber){
            this.adressNumber = adressNumber;
            return this;
        }

        public Builder amountWindows(int amountWindows){
            this.amountWindows = amountWindows;
            return this;
        }

        public Builder amountDoors(int amountDoors){
            this.amountDoors = amountDoors;
            return this;
        }


    }

    public static void main(String[] args) {
        House meinHouse = new Builder("koenigsstr.",4)
                .adressNumber(3)
                .amountDoors(15)
                .amountWindows(25).build();
        System.out.println(meinHouse);
    }
}
