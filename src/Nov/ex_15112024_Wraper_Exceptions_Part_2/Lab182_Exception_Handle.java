package Nov.ex_15112024_Wraper_Exceptions_Part_2;

public class Lab182_Exception_Handle {
    public static void main(String[] args) {
        System.out.println("Start");
        String s1 = null;
        try {
            s1.trim();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("End");
    }
}
