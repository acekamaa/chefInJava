//program to demo inheritance and polymorphism
//parent/superclass
class Animal {
    public void animalSound()
    {
        System.out.println("Animal makes sound");
    }
   
}

//subclass one
class Pig extends Animal{
    public void animalSound()
    {
        System.out.println("Pig says: oink oink");
    }
}

//second subclass 
public class Hen extends Animal{
    public void animalSound()
    {
        System.out.println("Hen says: kakaaa kakaa");
    }
}

//main function and the main class
class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myHen = new Hen();

        myAnimal.animalSound();
        myPig.animalSound();
        myHen.animalSound();
    }
}