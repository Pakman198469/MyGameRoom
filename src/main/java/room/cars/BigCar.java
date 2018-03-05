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


    private BigCar(String name, int toyCategory) {
        super(name, toyCategory);
    }

    public double getPrice() {
        return price;
    }

    public String getCarControl() {
        return carControl;
    }

    public String getMoreInfo() {
        return carControl + "(4AA batteries) ";
    }
}
