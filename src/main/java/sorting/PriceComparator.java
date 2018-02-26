package sorting;

import room.Toy;

import java.util.Comparator;

/**
 * Created by Aleh_Hutyrchyk on 2/23/2018.
 */
public class PriceComparator implements Comparator <Toy> {

    public int compare(Toy o1, Toy o2) {
        return ((Double) o1.getPrice()).compareTo(o2.getPrice());
    }
}
