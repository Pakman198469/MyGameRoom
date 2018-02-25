package room.constructor;

import room.Toy;

/**
 * Created by Aleh_Hutyrchyk on 2/23/2018.
 */
public class Lego extends Toy{
    private double price = 15.5;

    public Lego() {
        this("Lego Pirates", 2);
    }

    public Lego(String name, int toyCategory) {
        super(name, toyCategory);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
