package Exceptions.trycatch;

public class Main {
    public static void main(String[] args) {
        //try n catch block
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Something went wrong");
        }
        finally
        {
            System.out.println("The 'try catch' is finished.");
        }
    }
}
