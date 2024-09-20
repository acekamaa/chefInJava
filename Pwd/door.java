package Pwd;
import java.util.Scanner;

public class door {
    public static void password(int b) {
        try (Scanner myPassword = new Scanner(System.in))
        {
            int a = 5785;

            //check if passwords match
            //practicing short hand if...else
            String result = (a == b) ? "Welcome back" : "Wrong password";
            System.out.println(result);
        }
        catch (Exception e) {

        }
    }
    public static void main(String[] args) {
        //function call
        password(1234);
    }
}
