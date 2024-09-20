package Hashmaps.mixedval;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        //add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        //print keys and values
        for (String i : people.keySet())
        {
            System.out.println("keys: " + i + " values: " + people.get(i));
        }
    }    
}
