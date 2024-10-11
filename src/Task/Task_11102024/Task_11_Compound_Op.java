package Task.Task_11102024;

public class Task_11_Compound_Op {

    public static void main(String[] args) {
        int num = 7;

        System.out.println("Num + 3  =  " + (num += 3));
        System.out.println("Num - 4  =  " + (num -= 4));
        System.out.println("Num * 5  =  " + (num *= 5));
        System.out.println("Num / 6  =  " + (num /= 6));
        System.out.println("Num % 7  =  " + (num %= 7));

    }
}
