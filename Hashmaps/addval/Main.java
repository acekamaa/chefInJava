package Hashmaps.addval;
import java.util.HashMap;//store items in key/value pair

public class Main {
    public static void main(String[] args) {
        //create Hashmap object - capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        //add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);

        //accessing an item
        capitalCities.get("England");

        //remove an item
        capitalCities.remove("Oslo");
        System.out.println(capitalCities);

        /*to clear a hashmap
         * capitalCities.clear();
         */

         //to get the size of the hashmap
         //capitalCities.size();
         System.out.println("size of hashmap = " + capitalCities.size());
    }
}
