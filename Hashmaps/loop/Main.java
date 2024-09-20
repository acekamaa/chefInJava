package Hashmaps.loop;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> myCities = new HashMap<String, String>();

        myCities.put("England", "London");
        myCities.put("Germany", "Berlin");
        myCities.put("Norway", "Oslo");
        myCities.put("USA", "Washington DC");
        System.out.println(myCities);

        //loop through using for each
        //use keyset() to loop through keys
        for (String i : myCities.keySet())
        {
            System.out.println(i);
        }

        //use values() to loop through values
        for (String i : myCities.values())
        {
            System.out.println(i);
        }

        //to loop through both keys and value
        for (String i : myCities.keySet())
        {
            System.out.println("key: " + i + " value: " + myCities.get(i));
        }
    }
}
