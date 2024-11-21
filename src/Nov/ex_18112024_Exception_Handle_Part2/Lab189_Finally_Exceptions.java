package Nov.ex_18112024_Exception_Handle_Part2;

import java.util.Scanner;

public class Lab189_Finally_Exceptions {
    public static void main(String[] args) {
        Scanner sc = null;
        sc = new Scanner(System.in);
        int v = sc.nextInt();
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            sc.close();
            System.out.println("Closing Sc");
        }
        System.out.println("Hello");
        sc.close();

    }
}
