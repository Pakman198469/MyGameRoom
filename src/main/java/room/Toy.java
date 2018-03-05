package room;

/**
 * Created by Aleh_Hutyrchyk on 2/23/2018.
 */
public abstract class Toy {
    private int ageCategory;
    private String name;
    private double price;


    public Toy(String name, int ageCategory) {
        this.ageCategory = ageCategory;
        this.name = name;
    }

    @Override
    public String toString(){
        return name + "|" + " Age category=  " + ageCategory + "|" + " Price= " + this.getPrice() + "|";
    }

    public int getAgeCategory() {
        return ageCategory;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
