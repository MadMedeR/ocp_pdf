package fragen_July_2018;

public class _191{
    
    }

class A4{
    protected static final int i;
    private void doStuff(){}
}

final abstract class A5{
    protected static int i;
    void doStuff(){}
    abstract void doIt();
   }

/*
Which two class definitions fail to compile? (Choose two.)

A)  final class A1{
    public A1(){}
    }

B) public class A2{
     private static int i;
      private A2(){}
     }

C) final abstract class A5{
       protected static int i;
       void doStuff(){}
       abstract void doIt();
      }

D) class A4{
        protected static final int i;
        private void doStuff(){}
}

E) abstract class A3{
     private static int i;
     public void doStuff(){}
     public A3(){}
}
*/

//Answer C (The class A5 can be either abstract or final, not both), D (The blank final field i may not have been initialized)