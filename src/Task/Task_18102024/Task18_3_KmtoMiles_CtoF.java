package Task.Task_18102024;

import java.util.Scanner;

public class Task18_3_KmtoMiles_CtoF {
    public static void main(String[] args) {

        System.out.println("Enter the choice between 1-2");
        int choice;
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("You have selected Kilometer To Miles conversion");
                System.out.println("Enter KM to convert in to miles");
                int KM;
                Scanner scanner1 = new Scanner(System.in);
                KM = scanner1.nextInt();
                double miles;
                miles = KM * 0.62137d;
                System.out.println("Conversion of KM TO MILES is " + miles);
                break;

            case 2:
                System.out.println("You have selected Celsius to Fahrenheit conversion");
                System.out.println("Enter Fahrenheit value to convert in to Celsius  ");
                float C;
                float F;
                Scanner scanner2 = new Scanner(System.in);
                C = scanner2.nextFloat();
                F = C * (9/5) + 32;
                System.out.println("Conversion of Celsius to Fahrenheit is " + F);
                break;
            default:
                System.out.println("Invalid choice. Please enter the choice between 1-2");
                break;

        }
    }
}
