//interface class  - another way to achieve abstraction
interface Animal {
    //methods in an interface dont have bodies
    public void animalSound();
    public void sleep();
}

//pig 'implements - keyword' Animal interface
class Pig implements Animal {
    //body of method animalSound
    public void animalSound()
    {
        System.out.println("The pig says: oink oink");
    }

    //body of method sleep
    public void sleep()
    {
        System.out.println("Zzzz");
    }
}

//main class
class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}