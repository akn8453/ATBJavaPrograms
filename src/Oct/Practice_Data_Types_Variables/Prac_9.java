package Oct.Practice_Data_Types_Variables;

import java.util.Scanner;

public class Prac_9 {
    public static void main(String[] args) {
            /*
            Write a Java program to convert minutes into years and days.
            Test Data
            Input the number of minutes: 3456789
            Expected Output :
            3456789 minutes is approximately 6 years and 210 days
             */
        System.out.println("Minutes into years and days");
        System.out.println("Enter the mins");
        int min;
        int years;
        int days;
        Scanner scanner = new Scanner(System.in);
        min = scanner.nextInt();
        years = min / 525600;
        days =  min / 1440;
        System.out.println(min + " is approximately " + years + " years and " + days + " days");
    }
}
