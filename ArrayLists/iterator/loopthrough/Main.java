package ArrayLists.iterator.loopthrough;
import java.util.Iterator; //loops through a collection
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        //make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        //get the iterator
        Iterator<String> it= cars.iterator();

        //print the first item
        System.out.println(it.next());
        System.out.println(it.hasNext());
    }    
}
