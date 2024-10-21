package Oct.Practice_Data_Types_Variables;

import java.util.Scanner;

public class Prac_7 {
    public static void main(String[] args) {
        /*
        Write a Java program that reads a number in inches and converts it to meters.
        Note: One inch is 0.0254 meter.
        Test Data
        Input a value for inch: 1000
        Expected Output :
        1000.0 inch is 25.4 meters
         */
        System.out.println("Inches to meters conversion");
        System.out.println("Enter the inches");
        int inches;
        double meters;
        Scanner scanner = new Scanner(System.in);
        inches = scanner.nextInt();
        meters = inches * (0.0254);
        System.out.println(inches + " inch is " + meters + " meters");

    }
}
