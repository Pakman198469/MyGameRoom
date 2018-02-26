package room.cars;

import room.Toy;

/**
 * Created by Aleh_Hutyrchyk on 2/23/2018.
 */
public class SmallCar extends Toy {
    private  double price = 16.8;

    public SmallCar() {
        this("Small Car", 1);
    }

    public  SmallCar(String name, int toyCategory) {
        super(name, toyCategory);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
