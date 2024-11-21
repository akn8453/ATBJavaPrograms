package Nov.ex_18112024_Exception_Handle_Part2;

public class Lab191_Multiple_Catch_Or {
    public static void main(String[] args) {

        int b = 0;
        try {
            String ip = args[0];
            int a = Integer.parseInt(ip);
            b = 1000 / a;
        }catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
