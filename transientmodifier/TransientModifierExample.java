package transientmodifier;
import java.io.*;

class Employee implements Serializable {
    private String name;
    private int age;
    private String address;

    // transient modifier
    transient private String socialSecurityNumber;

    //constructor Employee
    public Employee(String name, int age, String address, String socialSecurityNumber) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
}

public class TransientModifierExample {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 35, "123 Main Street", "123-45-6789");

        try {
            FileOutputStream fos = new FileOutputStream("employee.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(employee);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("employee.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee employeeRead = (Employee) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Name: " + employeeRead.getName());
            System.out.println("Age: " + employeeRead.getAge());
            System.out.println("Address: " + employeeRead.getAddress());
            System.out.println("Social Security Number: " + employeeRead.getSocialSecurityNumber());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}