package Nov.ex_18112024_Exception_Handle_Part2;

public class Lab187_Execptions_OkOk_2 {
    public static void main(String[] args) {
        int a = 0;
        int c = 0;
        try {
            c = 10/a;
            String s1 = null;
            s1.trim();
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c);

    }
}
