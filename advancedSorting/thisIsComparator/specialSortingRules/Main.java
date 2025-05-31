package advancedSorting.thisIsComparator.specialSortingRules;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SortEvenFirst implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Integer a = (Integer) obj1;
        Integer b = (Integer) obj2;

        // Check if both numbers are even or odd
        boolean aIsEven = (a % 2) == 0;
        boolean bIsEven = (b % 2) == 0;

        if (aIsEven == bIsEven) {
            // if both are even or odd, sort by normal sorting
            if (a < b) return -1;
            if (a > b) return 1;
            return 0;
        } else {
            // if a is even then it goes first, else b goes first
            if (aIsEven) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(5);
        myNumbers.add(2);
        myNumbers.add(8);
        myNumbers.add(1);
        myNumbers.add(4);
        myNumbers.add(3);
        myNumbers.add(6);

        Comparator myComparator = new SortEvenFirst();
        Collections.sort(myNumbers, myComparator);

        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}
