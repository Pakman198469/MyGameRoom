package room;

/**
 * Created by Aleh_Hutyrchyk on 2/23/2018.
 */
public abstract class Toy {
    private int toyCategory;
    private String name;
    private double price;

    public Toy(String name) {
        this.toyCategory = toyCategory;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString(){
        return name;
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
