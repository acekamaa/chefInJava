package ClassMore;

class Outside {
   int x = 5;

   //innerclass
   class Inside {
    public int myInnerMethod()
    {
        return x;
    }
   }
}

class Main {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    //System.out.println(myInner.myInnerMethod());
    System.out.println(myInner);
  }
}