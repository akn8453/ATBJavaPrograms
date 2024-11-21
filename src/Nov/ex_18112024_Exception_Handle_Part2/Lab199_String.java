package Nov.ex_18112024_Exception_Handle_Part2;

public class Lab199_String {
    public static void main(String[] args) {
     /*   String a = "a";
        String b = "b";
        String c = a+b;
        System.out.println(c);
  */
        try {
            int a = 10 / 0;
        } catch (Exception e) {
          // e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("Div by zero");
        }

    }
}
