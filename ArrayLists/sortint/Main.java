package ArrayLists.sortint;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myInt = new ArrayList<Integer>();
        myInt.add(30);
        myInt.add(12);
        myInt.add(15);
        myInt.add(33);
        myInt.add(25);

        //sort numerically
        Collections.sort(myInt);

        //for each loop
        for (int i : myInt)
        {
            System.out.println(i);
        }
    }
}
