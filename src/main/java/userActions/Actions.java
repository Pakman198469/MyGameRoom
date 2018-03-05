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
            Toy toy;
            toy = getToy();
            if (!addToyToGameRoom(toy)) break;
            money += toy.getPrice();
        }
    }

    private String getRoomContent(List<Toy> myGameRoomContent) {
        String result = "\nOutput:\n";
        for (Toy toy : myGameRoomContent) {
            if(toy instanceof BigCar) {
                result += toy.toString() + " " + ((BigCar) toy).getMoreInfo() + "\n";
            } else if(toy instanceof SmallCar) {
                result += toy.toString() + " " + ((SmallCar) toy).getMoreInfo() + "\n";
            } else
            result += toy.toString() + "\n";
        }
        return result;
    }

    public String getRoomContent() {
        return getRoomContent(myGameRoom);
    }

    private String getSearchByPriceResults(List<Toy> foundItemByPrice) {
        ListIterator iterator = foundItemByPrice.listIterator();
        String result = "";
        try {
            if (!iterator.hasNext()) {
                Throwable ex = new Exception();
                throw ex;
            }
        } catch (Throwable throwable) {
            System.out.println("No items in defined price range!");
            System.exit(0);
        }
        while (iterator.hasNext()) {
            result += iterator.next() + "\n";
        }
        return result;
    }

    /*private String getSearchByPriceResults(List<Toy> foundByPrice) {
        ListIterator iterator = foundByPrice.listIterator();
        String result = "";
        if(!iterator.hasNext()) {
            result += "No items in defined price range!";
        }
        while (iterator.hasNext()) {
            result += iterator.next() + "\n";
        }
        return result;
    }*/

    public String getSearchByPriceResult() {
        return getSearchByPriceResults(foundByPrice);
    }

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
        System.out.println("\nToys found in price range from " + minPrice + " to " + maxPrice + " :\n");
        return getSearchByPriceResults(foundByPrice);
    }

}