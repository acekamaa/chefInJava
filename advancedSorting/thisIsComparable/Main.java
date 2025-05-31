package advancedSorting.thisIsComparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Car implements Comparable {
    public String brand;
    public String model;
    public int year;

    public Car(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }


    // Decide how this object compares to another object
    public int compareTo(Object obj) {
        Car other = (Car)obj;
        if (year < other.year) return -1;
        if (year > other.year) return 1;
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        //  Create a list of cars
        ArrayList<Car> myCars = new ArrayList<>();
        myCars.add(new Car("Toyota", "Corolla", 2010));
        myCars.add(new Car("Honda", "Civic", 2015));
        myCars.add(new Car("Ford", "Focus", 2012));

        // sort the cars
        Collections.sort(myCars);

        // Display the cars
        for (Car car : myCars) {
            System.out.println(car.brand + " " + car.model + " " + car.year);
        }
    }    
}
