package ArrayLists.sortstring;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        //sort through cars alphabetically
        Collections.sort(cars);

        //for each loop
        for (String i : cars)
        {
            System.out.println(i);
        }
    }    
}
