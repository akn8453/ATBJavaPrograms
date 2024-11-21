package Nov.ex_18112024_Exception_Handle_Part2;

public class Lab_Finally_Not_Excecuted {
    public static void main(String[] args) {
        try {
            int a = 10 / 10;
          //  System.exit(0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("Not Printed");
        }
    }
}
