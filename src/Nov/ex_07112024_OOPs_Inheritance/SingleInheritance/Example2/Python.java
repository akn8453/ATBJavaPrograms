package Nov.ex_07112024_OOPs_Inheritance.SingleInheritance.Example2;

public class Python extends Programming {

    //extend -> Is A
    //Python is a programming

    void print(){
        System.out.println(author);
        System.out.println(version);
    }
    Python (){
        System.out.println("DC");
    }

    public static void main(String[] args) {
        Python p1 = new Python();
        System.out.println(p1.author);

    }
}
