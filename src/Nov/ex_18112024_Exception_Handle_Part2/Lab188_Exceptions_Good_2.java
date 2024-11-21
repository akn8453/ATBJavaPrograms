package Nov.ex_18112024_Exception_Handle_Part2;

public class Lab188_Exceptions_Good_2 {
    public static void main(String[] args) {
        int a = 0;
        int c = 0;
        try {
            c = 10/a;
            String s1  = null;
            s1.trim();
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I will be always executed");
        }
    }
}
