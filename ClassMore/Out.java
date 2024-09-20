package ClassMore;
public class Out {
    int x;

    //create an innerclass
    class InnerClass {
        int y = 5;
    }
}

class Main {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass(); //to access the inner class
        System.out.println(myInner.y + myOuter.x);
    }
}