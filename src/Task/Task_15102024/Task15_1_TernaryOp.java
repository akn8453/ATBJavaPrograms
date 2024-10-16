package Task.Task_15102024;

public class Task15_1_TernaryOp {
    public static void main(String[] args) {
        int a = 100, b = 50, c = 30;
        int max = (a >= b && a >= c) ? a : (b >= c ? b : c);
        System.out.println("Max value is " + max);
    }
}
