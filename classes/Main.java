public class Main {
    int modelYear;
    String modelName;

    //create a constructor
    public Main(int year, String name)
    {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        //create an object
        Main myCar = new Main(1969, "Mustang");

        //output
        System.out.println(myCar.modelYear + " " + myCar.modelName);

    }
}
