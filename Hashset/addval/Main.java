package Hashset.addval;
import java.util.HashSet;//hashset is a collection of items where every item is unique

public class Main {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();

        //add values
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        //check whether an item exists using contains()
        cars.contains("Mazda");

        //remove an item remove()
        cars.remove("Volvo");
        System.out.println(cars);

        /*to remove all items
         * cars.clear()
         */

         //hashset size
         System.out.println("size of the hashset is: " + cars.size());
    }    
}
