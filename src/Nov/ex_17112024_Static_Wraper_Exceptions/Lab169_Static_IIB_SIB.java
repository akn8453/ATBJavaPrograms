package Nov.ex_17112024_Static_Wraper_Exceptions;

public class Lab169_Static_IIB_SIB {
    public static void main(String[] args) {
        A a  = new A();
        A a1 = new A();
        A a2; //Only ref creation does not call the SIB.
        //System.out.println();
    }
}

class A {
    {
        System.out.println("IIB");
    }

    static {
        System.out.println("SIB");
    }
}
