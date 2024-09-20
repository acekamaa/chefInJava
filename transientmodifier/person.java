package transientmodifier;
public class person {
    private String name;
    private int age;
    //transient modifier - value will not be saved or serialized
    private transient double salary;

    //create a constructor
    public person(String name, int age, double salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public double getSalary()
    {
        return salary;
    }

    //main function
}