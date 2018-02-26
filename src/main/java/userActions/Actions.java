package userActions;

import room.RandomToyGenerator;
import room.Toy;
import room.cars.BigCar;
import room.cars.MediumCar;
import room.cars.SmallCar;
import room.constructor.Lego;
import room.puzzles.Puzzle;
import room.weapon.Rifle;
import sorting.NameComparator;
import sorting.PriceComparator;

import java.util.*;

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
    private List<Toy> foundByPrice;


    public Actions(int toyLimit, double moneyLimit) {
        this.toyLimit = toyLimit;
        this.moneyLimit = moneyLimit;
        this.randomToyGenerator = new RandomToyGenerator(toyClasses);
        this.myGameRoom = new ArrayList<Toy>();
        this.foundByPrice = new ArrayList<Toy>();
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

    private String getResults(List<Toy> myGameRoom) {
        String result = "\nOutput:\n";
        for (Toy toy : myGameRoom) {
            result += toy.toString() + "\n";
        }
        return result;
    }

    public String getResults() {
        return getResults(myGameRoom);
    }

    private String getSearchResults(List<Toy> foundByPrice) {
        String result = "";
        for (Toy x : foundByPrice) {
            //System.out.println(x);
            result += x.toString();
        }
        return result;
    }

    /*private String getSearchResult() {
        return getSearchResults(foundByPrice);
    }*/

    public void sortByName() {
        NameComparator nameComparator = new NameComparator();
        Collections.sort(myGameRoom, nameComparator);
        System.out.println("\nSorted by name: \n");
        for(Toy x : myGameRoom) {
            System.out.println(x.getName() + " " + x.getPrice());
        }
    }

    public void sortByPrice() {
        PriceComparator priceComparator = new PriceComparator();
        Collections.sort(myGameRoom, priceComparator);
        System.out.println("\nSorted by price: \n");
        for (Toy x : myGameRoom) {
            System.out.println(x.getName() + " " + x.getPrice());
        }
    }

    public String findByPrice(double minPrice, double maxPrice) {
        for (Toy x : myGameRoom) {
            if(x.getPrice() >= minPrice && x.getPrice() <= maxPrice) {
                foundByPrice.add(x);
            }
        }
        System.out.println("\nToys found in price range:");
        return getSearchResults(foundByPrice);
    }

}