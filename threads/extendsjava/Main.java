package extendsjava;

public class Main extends Thread {
    static int amount = 0;

    public static void main (String[] args)
    {
        Main thread = new Main();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
    @Override
    public void run()
    {
        amount++;
    }
}