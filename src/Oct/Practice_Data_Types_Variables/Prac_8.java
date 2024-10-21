package Oct.Practice_Data_Types_Variables;

import java.util.Scanner;

public class Prac_8 {
    public static void main(String[] args) {
/*
Write a Java program that reads an integer between 0 and 1000 and adds
all the digits in the integer.
Test Data
Input an integer between 0 and 1000: 565
Expected Output :
The sum of all digits in 565 is 16
 */

        System.out.println("adds all the digits in the integer.");
        System.out.println("Enter the integer between 0-1000");
        int integer,rem,sum=0;
        Scanner scanner = new Scanner(System.in);
        integer = scanner.nextInt();

        while (integer>0){

          // num = integer;
          rem = integer % 10;
          sum = sum + rem;
          integer = integer/10;

        }
        System.out.println("The sum of all digits is " + sum);

    }
}
