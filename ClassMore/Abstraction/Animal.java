package ClassMore.Abstraction; 

abstract class Animal {
    //abstract method
    public abstract void animalSound();
    //regular method
    public void sleep()
    {
        System.out.println("Zzz");
    }    
}

//subclass inherited from animal
class Pig extends Animal {
    public void animalSound()
    {
        //body of animalSound
        System.out.println("The pig says: oink oink");
    }
}
class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}
