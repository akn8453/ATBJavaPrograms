package Nov.ex_08112024_OOPs_Polymorphsim.MethodOverRidding;

public class Lab159 {
    public static void main(String[] args) {

        Son s = new Son();
        s.cars_f();
        s.gold_f();
        s.home_f();
        s.home();
        s.gold();
        s.cars();

        Father f = new Father();
        f.cars_f();
        f.gold_f();
        f.home_f();


        //Dynamic dispatch
        Father f1 = new Son();
        f1.home_f();
        f.gold_f();
        f1.cars_f();
    }
}

class Father{
    void  home_f(){

        System.out.println("Having 3bhk flat");
    }
    void cars_f (){

        System.out.println("Having 3 cars");
    }

    void gold_f (){

        System.out.println("Having gold saving also");
    }

}

class Son extends Father{
    void  home(){

        System.out.println("Having 2bhk flat");
    }
    void cars (){

        System.out.println("Having 1 cars");
    }

    void gold (){

        System.out.println("Having no gold saving also");
    }

}