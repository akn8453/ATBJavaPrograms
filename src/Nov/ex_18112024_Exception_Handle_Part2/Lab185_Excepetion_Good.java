package Nov.ex_18112024_Exception_Handle_Part2;

public class Lab185_Excepetion_Good {
    public static void main(String[] args) {
        int a = 0;
        int c = 0;
        try {
            c = 10/a;
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
    }
}
