package Oct.Practice_Data_Types_Variables;

import java.util.Scanner;

public class Prac_6 {
    public static void main(String[] args) {
        // Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
        /*
        Test Data
        Input a degree in Fahrenheit: 212
        Expected Output:
        212.0 degree Fahrenheit is equal to 100.0 in Celsius
         */
        System.out.println("Fahrenheit to Celsius degrees Conversion");
        System.out.println("Enter the Temperature");
        float temp;
        float c;
        Scanner scanner = new Scanner(System.in);
        temp = scanner.nextFloat();
        c = ((temp - 32)*5)/9;

        System.out.println(temp + " degree Fahrenheit is equal to" + " " + c);


    }
}
