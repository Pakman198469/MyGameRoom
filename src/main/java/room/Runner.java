package room;

import room.cars.BigCar;
import room.cars.Cars;
import room.cars.MediumCar;
import room.cars.SmallCar;
import userActions.Actions;

/**
 * Created by Aleh_Hutyrchyk on 2/23/2018.
 */
public class Runner {
    public static void main(String[] args) {
        Actions actions = new Actions(6, 300);
        actions.fillGameRoom();
        System.out.println(actions.getRoomContent());
        actions.sortByName();
        actions.sortByPrice();
        actions.findByPrice(3,31);
        System.out.println(actions.getSearchByPriceResult());

    }
}
