package ClassMore.enumclass.enuminclass;

public class Main {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }


    //main method
    public static void  main(String[] args)
    {
        Level myVar = Level.HIGH;
        System.out.println(myVar);
    }
}