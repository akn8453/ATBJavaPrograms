package Nov.ex_07112024_OOPs_Inheritance.HierarchicalInheritance;

public class Lab157 {
    public static void main(String[] args) {

        Son1 s1 = new Son1();
        s1.car();
        s1.gold();
        s1.home();
        s1.prop();
        s1.car_Father();
        s1.gold_Father();
        s1.home_Father();
        s1.prop_Father();

       Son2 s2 = new Son2();
        s2.car();
        s2.gold();
        s2.home();
        s2.prop();
        s1.car_Father();
        s1.gold_Father();
        s1.home_Father();
        s1.prop_Father();

        Daughter d1 = new Daughter();
        d1.car();
        d1.gold();
        d1.home();
        d1.prop();
        s1.car_Father();
        s1.gold_Father();
        s1.home_Father();
        s1.prop_Father();

    }
}
