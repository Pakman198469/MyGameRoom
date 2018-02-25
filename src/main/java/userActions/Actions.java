package userActions;

import room.RandomToyGenerator;
import room.Toy;
import room.cars.BigCar;
import room.cars.MediumCar;
import room.cars.SmallCar;
import room.constructor.Lego;
import room.puzzles.Puzzle;
import room.weapon.Rifle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Aleh_Hutyrchyk on 2/23/2018.
 */
public class Actions {

    private int toyLimit;
    private double moneyLimit;
    private double money;
    private RandomToyGenerator randomToyGenerator;
    private List<Class<? extends Toy>> toyClasses = new ArrayList(Arrays.asList(BigCar.class, MediumCar.class, SmallCar.class, Lego.class, Puzzle.class,Rifle.class));
    private List<Toy> myGameRoom;

    public Actions(int toyLimit, double moneyLimit) {
        this.toyLimit = toyLimit;
        this.moneyLimit = moneyLimit;
        this.randomToyGenerator = new RandomToyGenerator(toyClasses);
        this.myGameRoom = new ArrayList<Toy>();
    }

    private boolean addToyToGameRoom(Toy toy) {
        if(myGameRoom.size() < toyLimit && money + toy.getPrice() <= moneyLimit) {
            myGameRoom.add(toy);
            return true;
        } else return false;
    }

    private Toy getToy() {
        return randomToyGenerator.getRandomToy();
    }

    public void fillGameRoom () {
        while(true) {
            Toy toy = getToy();
            if (!addToyToGameRoom(toy)) break;
            money += toy.getPrice();
        }
    }

    public String getOutput(List<Toy> myGameRoom) {
        String result = "\nOutput:\n";
        for (Toy toy : myGameRoom) {
            result += toy.toString() + "\n";
        }

        return result;
    }

    public String getOutput() {
        return getOutput(myGameRoom);
    }

}