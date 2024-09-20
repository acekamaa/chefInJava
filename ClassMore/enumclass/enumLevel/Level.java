package ClassMore.enumclass.enumLevel;
//enum (enumerations) classes are like final attributes, value is final doesnt change
//separate constants with a comma
//constants should be in caps
enum Level {
    LOW,
    MEDIUM,
    HIGH
}

class Main {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;//To access the enums use the dot factor
        System.out.println(myVar);
    }
}