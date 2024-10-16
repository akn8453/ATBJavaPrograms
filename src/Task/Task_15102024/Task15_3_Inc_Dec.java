package Task.Task_15102024;

public class Task15_3_Inc_Dec {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(--a + a++ + a--);
        System.out.println(a);


        // --a = 19
        // a++ = 19
        // a--   20
        // --a + a++ + a-- = 58
        //a = 19
    }
}
