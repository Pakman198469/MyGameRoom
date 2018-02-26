package room;

import room.cars.BigCar;
import userActions.Actions;

/**
 * Created by Aleh_Hutyrchyk on 2/23/2018.
 */
public class Runner {
    public static void main(String[] args) {
        //List <Class<? extends Toy>> toyClasses = new ArrayList(Arrays.asList(BigCar.class, MediumCar.class, SmallCar.class, Lego.class, Puzzle.class,Rifle.class));

        Actions actions = new Actions(20, 300);
        actions.fillGameRoom();
        System.out.println(actions.getResults());
        actions.sortByName();
        actions.sortByPrice();
        actions.findByPrice(8,16);



        System.out.println("\n" + "Home");

        BigCar bigCar = new BigCar();
        System.out.println(bigCar.getPrice() + " " + bigCar.getName() + " " + bigCar.carControl() + " " + bigCar.getToyCategory());

        //RandomToyGenerator rtg = new RandomToyGenerator(toyClasses);
        //System.out.println(rtg.getRandomToy());
    }
}
