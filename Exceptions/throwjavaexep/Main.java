package Exceptions.throwjavaexep;

public class Main {
    static void checkAge(int age)
    {
        if (age < 18)
        {
            //customise your own exception
            throw new ArithmeticException("Access denied - you must be above 18");
        }
        else {
            System.out.println("Access granted, you are old enough!");
        }
    }

    public static void main(String[] args) {
        //check with val less than 18
        checkAge(12);
    }
}