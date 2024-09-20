//program to demo inheritance and polymorphism
//parent/superclass
public class Animal {
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