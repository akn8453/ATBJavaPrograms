package Task.Task_11102024;

public class Task_11_Ternary_Op {
    public static void main(String[] args) {
        int a = 20, b = 10, c = 30, result;

        // result holds max of three
        // numbers
        result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        System.out.println("Max of three numbers = "  + result);

    }
}
