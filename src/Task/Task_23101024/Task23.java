package Task.Task_23101024;

import java.util.Scanner;

public class Task23 {

    public static void main(String[] args) {

        int Num1;
        int Num2;
        System.out.println("Enter the Number1");
        Scanner scanner = new Scanner(System.in);
        Num1 = scanner.nextInt();
        System.out.println("Enter the Number2");
        Num2 = scanner.nextInt();

      int sum = sum_of_two_num(Num1, Num2);
        System.out.println("Sum of two number is "+ sum);

        int sub = sub_of_two_num(Num1, Num2);
        System.out.println("Sub of two number is "+sub);

        int mul = mul_of_two_num(Num1, Num2);
        System.out.println("Mul of two number is "+mul);

        int div = div_of_two_num(Num1, Num2);
        System.out.println("Div of two number is "+div);

        int mod = mod_of_two_num(Num1, Num2);
        System.out.println("Div of two number is "+mod);

    }

    static int sum_of_two_num(int a, int b){
        return a+b;
    }

    static int sub_of_two_num(int a, int b){
        return  a - b ;
    }

    static int mul_of_two_num(int a, int b){
        return  a * b ;
    }

    static int div_of_two_num(int a, int b){
        return  a / b ;
    }

    static int mod_of_two_num(int a, int b){
        return  a % b ;
    }


}
