package Nov.ex_15112024_Wraper_Exceptions_Part_2;

public class Lab183_Exception_Handle_Part2 {
    public static void main(String[] args) {
        int c = 0;
        int b = 0;
        try {
            b = 10/c;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);

    }
}
