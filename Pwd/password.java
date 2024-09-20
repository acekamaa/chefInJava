package Pwd;
import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pass = scanner.nextInt();

        //output password
        System.out.println("here is your new password: " + pass);
        scanner.close();
    }
}
