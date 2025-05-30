package Expressions.lambdaExpressions;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Maina {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        // use lambda expression with forEach()
        Consumer<Integer> printNumber = (n) -> {System.out.println(n); };
        // Using the lambda expression with forEach
        numbers.forEach(printNumber);
    }
}
