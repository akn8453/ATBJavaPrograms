package Task.Task_15102024;

public class Task15_1_TernaryOp {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        int max = a > b ? b > c ? a : b : c ;
        System.out.println("Max value is " + max);
    }
}
