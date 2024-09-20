package mypack; //package is a keyword

public class MyPackageClass {
    public static void main(String[] args) {
        System.out.println("This is my package!");
        /* to compile your class, do
         * javac filename.java
         * 
         * then compile your package
         * javac -d . filename
         * note that '-d' is for forcing to compile the package
         * the '.' is to diect the compiler on where to store the package
         * 
         * to run your package
         * eg: java mypack.MyPackageClass
         */
    }
}
