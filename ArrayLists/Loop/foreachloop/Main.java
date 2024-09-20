package ArrayLists.Loop.foreachloop;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");

        //for each loop
        for (String i : cars)
        {
            System.out.println(i);
        }
    }    
}
