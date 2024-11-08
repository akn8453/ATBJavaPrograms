package Nov.ex_07112024_OOPs_Inheritance_Single_Inheritance.SingleInheritance.Example1;

public class Lab155_SI {
    public static void main(String[] args) {
        //Single Inheritance
        //Son will get the attributes from father
        // 1 son and 1 father

        Son s1 = new Son();
        System.out.println(s1.glod_f);
        s1.bhk2();//son has extended
        s1.bhk3();

        Father f1 = new Father();
        //f1.bhk3(); father has not extended

    }
}


