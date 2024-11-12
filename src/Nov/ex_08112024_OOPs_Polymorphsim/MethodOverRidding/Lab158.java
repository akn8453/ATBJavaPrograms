package Nov.ex_08112024_OOPs_Polymorphsim.MethodOverRidding;

public class Lab158 {
    public static void main(String[] args) {

        hound h1 = new hound();
        h1.bark();
    }
}

class dog {

    void bark(){

        System.out.println("The dog barks");
    }

}

class hound extends dog{

    @Override
    void bark(){

        System.out.println("Hound can also bark");
    }
}