package Oct.ex_21102024_ForLoop;

public class Lab106 {
    public static void main(String[] args) {
        // TO find the even numbers from 1 to 50
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }else{
                System.out.println("Odd");
            }

        }
    }
}

