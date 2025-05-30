package Expressions.lambdaExpressions;

interface StringFunction {
    String run(String str);    
}

public class Param {
    public static void main(String[] args) {
       StringFunction exclaim = (str) -> str + "!";
       StringFunction ask = (str) -> str + "?";
       printFormatted("Hello", exclaim);
       printFormatted("Hello", ask);
    }

    public static void printFormatted(String str, StringFunction format) {
        // call the run method of the StringFunction interface
        String result = format.run(str);
        System.out.println(result);
    }
}
