package ClassMore;

public class OutClass {
   int x = 10;
   
   //private inner class
   /*private class InClass {
    int y = 5;
   }*/
}

//main class
//try accessing the out and in classes
class Main {
    public static void main(String[] args) {
        //create objects to access the outer class
        OutClass myOut = new OutClass();
        //create object to access the inner class
        //OutClass.InClass myIn = myOut.new InClass(); 
        //this will generate an error coz the class is not accessible as its set to private.
        System.out.println(myOut.x);
    }
}