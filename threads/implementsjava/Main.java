package implementsjava;

public class Main implements Runnable {
    public static void main(String[] args) {
        Main obj = new Main();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println(thread.isAlive());

        System.out.println("This code is running outside the thread.");
    }

    public void run() {
        System.out.println("This code is running inside the thread.");
    }
    
}
