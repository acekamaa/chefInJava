package ClassMore;
public class Person {
    private String name;

    //Getter
    public String getName()
    {
        return name;
    }

    //Setter
    public String setName(String newName)
    {
        this.name = newName;
        return newName;
    }

    //main method
    public static void main(String[] args) {
        //create object to call the public method
        Person myPerson = new Person();

        //call the getter and the setter functions
        myPerson.getName();
        myPerson.setName("Kevin");

        //output the newName
        //System.out.println(myPerson.setName("Kevin"));
    }
}
