//abstract and final classes
abstract class Meat {
    String a;
}

final class MeatBall extends Meat
{
	public static void main(String[] args) {
        MeatBall obj = new MeatBall();
        
        System.out.println("What meat do you want");
        System.out.println("Option 1: meatballs");
        System.out.println("Option 2: fillet");
        obj = a.nextLine();

        System.out.println("Nice choice you will be served with: " + obj.a);
    }
}