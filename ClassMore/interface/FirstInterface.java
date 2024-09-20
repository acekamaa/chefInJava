//implementing multiple interfaces
//first interface
interface FirstInterface {
    public void myMethod();
}

//second interface
interface SecondInterface {
    public void myOtherMethod();   
}

//class that implements both interfaces
//to implement both interfaces separate them using ','
class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod()
    {
        System.out.println("Some text....");
    }

    public void myOtherMethod()
    {
        System.out.println("Some other text,,,,");
    }
}

//main class
class Maina {
    public static void main(String[] args) {
        //object to call myMethod
        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}