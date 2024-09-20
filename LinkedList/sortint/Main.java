package LinkedList.sortint;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myInt = new ArrayList<Integer>();
        myInt.add(39);
        myInt.add(20);
        myInt.add(40);
        myInt.add(15);

        //sort in reverse or descending order
        Collections.sort(myInt, Collections.reverseOrder());

        //for each loop
        for (int i : myInt)
        {
            System.out.println(i);
        }
    }
}
