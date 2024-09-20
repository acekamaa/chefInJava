package ClassMore.enumclass.enumswitch;

public class Main {
    enum Level{
        LOW,
        MEDIUM,
        HIGH
    }

    //main method
    public static void main(String[] args) {
        Level myVar = Level.LOW;

        //switch statement
        switch (myVar) {
            case LOW:
                System.out.println("Low level");
                break;
        
            case MEDIUM:
                System.out.println("MEDIUM LEVEL");
                break;

            case HIGH:
                System.out.println("High level");
                break;

            default:
                System.out.println("Select level");
        }
    }
}

