package Task.Task_15102024;

public class Task15_2_Inc_Dec {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        // ++a = 11
        // a++ = 11
        // a++ = 12
        // ++a + a++ + a++ ---> 34
        // a = 13
    }
}
