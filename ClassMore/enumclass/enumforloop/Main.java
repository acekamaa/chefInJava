package ClassMore.enumclass.enumforloop;

enum Level {
    HIGH,
    LOW,
    MEDIUM
}

class Main {
    public static void main(String[] args)
    {
        for (Level myVar : Level.values())
        {
            System.out.println(myVar);
        }
    }
}