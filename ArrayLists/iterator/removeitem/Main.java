package ArrayLists.iterator.removeitem;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        
        //get the iterator
        Iterator<Integer> it = numbers.iterator();
        
        //loop through
        while(it.hasNext())
        {
            Integer i = it.next();
            if (i < 10) {
                it.remove();
            }
        }
        System.out.println(numbers);
    }     
}
