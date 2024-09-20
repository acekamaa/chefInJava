import java.util.Scanner;

class Codechef
{
    public static void main (String[] args)
    {
        try (Scanner read = new Scanner(System.in)) {
            String A = read.nextLine();
            String B = read.next();
            String C = read.next();
            String D = read.next();
            String E = read.next();

            System.out.print(A + "\n" + B + "\n" + C + "\n" + D + "\n" + E);
        }
    }
}