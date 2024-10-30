package Task.Task_24102024;

import java.util.Scanner;
public class Task24_Functions {
    public static void main(String[] args) {

        int Num1,Num2;
        System.out.println("Enter the number1");
        Scanner scanner = new Scanner(System.in);
        Num1 = scanner.nextInt();
        System.out.println("Enter the number2");
        Num2 = scanner.nextInt();

        int Sum = sum_of_two_num(Num1 , Num2);
        System.out.println("Sum of the two number is " + Sum);
        int Sub = sub_of_two_num(Num1 , Num2);
        System.out.println("Sub of the two number is " + Sub);
        int Mul = mul_of_two_num(Num1 , Num2);
        System.out.println("Mul of the two number is " + Mul);
        int Div = div_of_two_num(Num1 , Num2);
        System.out.println("Div of the two number is " + Div);
        int Mod = mod_of_two_num(Num1 , Num2);
        System.out.println("Mod of the two number is " + Mod);
    }

    static int sum_of_two_num(int a, int b){
        return a + b;
    }
    static int sub_of_two_num(int a, int b){
        return a - b;
    }
    static int mul_of_two_num(int a, int b){
        return a * b;
    }
    static int div_of_two_num(int a, int b){
        return a / b;
    }
    static int mod_of_two_num(int a, int b){
        return a % b;


    }
}
