package room.cars;

import room.Toy;

/**
 * Created by Aleh_Hutyrchyk on 2/23/2018.
 */
public class BigCar extends Toy implements Cars{
    private double price = 35;
    private String carControl = "Remote control";

    public BigCar() {
        this("Big Car", 2);
    }

    public BigCar(String name, int toyCategory) {
        super(name, toyCategory);
        this.getPrice();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String carControl() {
        return this.carControl;
    }
}
