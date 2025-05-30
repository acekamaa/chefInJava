package extendsjava;

public class Maina extends Thread {
    public static int amount = 0;

    public void run() {
        amount++;
    }

    public static void main(String[] args) {
        Maina thread = new Maina();
        thread.start();

        // wait for the thread to finish
        while(thread.isAlive()) {
            System.out.println("Waiting for thread to finish...");
        }
        // update amount and print its value
        System.out.println("Maina: " + amount);
        amount++;
        System.out.println("Maina: " + amount);
    }
    
}
