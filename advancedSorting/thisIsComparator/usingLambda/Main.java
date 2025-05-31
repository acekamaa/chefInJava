package advancedSorting.thisIsComparator.usingLambda;
import java.util.ArrayList;
import java.util.Collections;

// Define a Car class
class Car {
    public String brand;
    public String model;
    public int year;

    public Car(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }
}

public class Main {
 public static void main(String[] args) {
        // create ArrayList of Cars
        ArrayList<Car> myCars = new ArrayList<Car>();
        myCars.add(new Car("Ford", "Mustang", 1969));
        myCars.add(new Car("Chevrolet", "Camaro", 1970));
        myCars.add(new Car("Dodge", "Charger", 1968));

        // use a lambda expression to sort the cars by year
        Collections.sort(myCars, (obj1, obj2) -> {
            Car a = (Car) obj1;
            Car b = (Car) obj2;

            // compare the year of the two objects
            if (a.year < b.year) return -1; // -1 returns if a is less than b
            if (a.year > b.year) return 1; // 1 returns if a is greater than b
            return 0; // 0 returns if a is equal to b
        });

        // display the cars
        for( Car c : myCars) {
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }   
    }
}
