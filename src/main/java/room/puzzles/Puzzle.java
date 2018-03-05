package room.puzzles;

import room.Toy;

/**
 * Created by Aleh_Hutyrchyk on 2/23/2018.
 */
public class Puzzle extends Toy{
    private double price = 8.6;

    public Puzzle() {
        this("Puzzle", 2);
    }

    private Puzzle(String name, int toyCategory) {
        super(name, toyCategory);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
