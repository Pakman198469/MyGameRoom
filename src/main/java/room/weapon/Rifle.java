package room.weapon;

import room.Toy;

/**
 * Created by Aleh_Hutyrchyk on 2/23/2018.
 */
public class Rifle extends Toy{
    private double price = 55.8;

    public Rifle() {
        this("Assult Rifle", 1);
    }

    public Rifle(String name, int toyCategory) {
        super(name, toyCategory);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
