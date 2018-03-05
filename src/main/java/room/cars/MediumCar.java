package room.cars;

import room.Toy;

/**
 * Created by Aleh_Hutyrchyk on 2/23/2018.
 */
public class MediumCar extends Toy {
    private double price = 20;

    public MediumCar() {
        this("Medium Car", 2);
    }

    private MediumCar(String name, int toyCategory) {
        super(name, toyCategory);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
