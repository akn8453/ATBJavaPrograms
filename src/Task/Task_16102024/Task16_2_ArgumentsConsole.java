package Task.Task_16102024;

public class Task16_2_ArgumentsConsole {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int Max = (a > b) ? a : b ;
        //System.out.println(args[0]);
        System.out.println(Max + " Is Maximum");

    }
}
