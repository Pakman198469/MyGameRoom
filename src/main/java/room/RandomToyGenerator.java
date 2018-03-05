package room;

import java.util.List;
import java.util.Random;

/**
 * Created by Aleh_Hutyrchyk on 2/23/2018.
 */
public class RandomToyGenerator {
    private List<Class<? extends Toy>> toysClasses;
    private Random rand = new Random();

    public RandomToyGenerator(List<Class<? extends Toy>> toysClasses) {
        this.toysClasses = toysClasses;
    }

    private Toy generateRandomToy() {
        try {
            return toysClasses.get(rand.nextInt(toysClasses.size())).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Toy getRandomToy() {
        return generateRandomToy();
    }
}
