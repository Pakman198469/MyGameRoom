package room;

/**
 * Created by Aleh_Hutyrchyk on 2/23/2018.
 */
public abstract class Toy {
    private int toyCategory;
    private String name;
    private double price;

    public Toy(String name, int toyCategory) {
        this.toyCategory = toyCategory;
        this.name = name;
    }

    @Override
    public String toString(){
        return name + " Toy category=  " + toyCategory + " Price= " + this.getPrice();
    }

    public int getToyCategory() {
        return toyCategory;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
