package Expressions.lambdaExpressions;
import java.util.ArrayList;

// parameter -> expression
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        // use lambda expression with forEach()
        numbers.forEach( (n) -> {System.out.println(n);});
    }
}
