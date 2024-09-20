package ClassMore.Scannerclass;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter name, age and salary");

        //string input
        String name = myObj.nextLine();

        //Numerical input
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        //output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        
        //close the scanner class to avoid resource leaks
        myObj.close();
    }    
}
