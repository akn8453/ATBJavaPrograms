package Nov.ex_05112024_OOps;

public class Lab150_Object_Class_2 {
    public static void main(String[] args) {
        Cat c1= new Cat();
        c1.name = "rosey";
        c1.sleep();
        System.out.println(c1.name);
    }
}
class Cat{
    String name;


    void sleep(){
        System.out.println("Sleeping");
    }
}