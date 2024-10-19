package Task.Task_18102024;

import java.util.Scanner;

public class Task18_1_SimpleCalculator {
    public static void main(String[] args) {

        System.out.println("Simple Calculator");
        int Num1;
        int Num2;
        System.out.println("Enter The First Number");
        Scanner scanner1 = new Scanner(System.in);
        Num1 = scanner1.nextInt();

        System.out.println("Enter The Second Number");
        Scanner scanner2 = new Scanner(System.in);
        Num2 = scanner2.nextInt();

        System.out.println("Enter the Arithmetic Operator");
        Scanner scanner3 = new Scanner(System.in);
        char operator = scanner3.next().charAt(0);
        switch (operator){
            case '+':
                int addition = Num1 + Num2;
                System.out.println("Addition of Num1 + Num2 is = " + addition);
                break;
            case '-':
                int subtraction = Num1 - Num2;
                System.out.println("Subtraction of Num1 - Num2 is = " + subtraction);
                break;
            case '*':
                int multiplication = Num1 * Num2;
                System.out.println("Multiplication of Num1 * Num2 is = " + multiplication);
                break;
            case '/':
                int division = Num1 / Num2;
                System.out.println("Division of Num1 / Num2 is = " + division);
                break;
            case '%':
                int modulus = Num1 % Num2;
                System.out.println("Modulus of Num1 % Num2 is = " + modulus);
                break;
            default:
                System.out.println("Invalid Input! Please Enter The Correct Operator");
                break;


        }

    }
}
