package ClassMore;

class Outing {
    int x;
    
    //static inner class doesnt have access to outer class attributes
    static class Ini {
        int y = 5;
    }
}

//main clas
class Main {
    public static void main(String[] args) {
        //use of static allows us to access the attributes of the inner class without creating objects
        Outing.Ini myIni = new Outing.Ini();
        System.out.println(myIni.y);
    }
}