package ArrayLists.Loop.forloop;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        //add items
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        //forloop
        //.size() rep size of the arraylist
        for (int i = 0; i < cars.size(); i++)
        {
            System.out.println(cars.get(i));
        }
    }
}