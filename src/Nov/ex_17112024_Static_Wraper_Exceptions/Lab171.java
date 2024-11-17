package Nov.ex_17112024_Static_Wraper_Exceptions;

public class Lab171 {
    public static void main(String[] args) {
        Automation t1 = new Automation();
        Automation t2 = new Automation();
        System.out.println(t1.driver);
        System.out.println(t2.driver);
    }
}
class Automation {
    static  String driver = "CHROME";
}
