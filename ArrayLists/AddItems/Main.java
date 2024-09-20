package ArrayLists.AddItems;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //create an arraylist object
        //arraylist are used to store and accessing data
        ArrayList<String> cars = new ArrayList<String>();

        //add items
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        //add item at an index
        cars.add(0, "Mercedes");
        System.out.println(cars);

        //access an item
        System.out.println(cars.get(3));

        //change an item
        cars.set(2, "Note");
        System.out.println(cars);
        
        //remove an item
        cars.remove(2);
        System.out.println(cars);

        //remove all items from cars
        cars.clear();
        System.out.println(cars);

        //find the size of arraylist
        System.out.println(cars.size());
    }    
}
