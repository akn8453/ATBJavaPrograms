package Task.Task_18102024;

import java.util.Scanner;

public class Task18_2_MonthName {
    public static void main(String[] args) {

        System.out.println("Month Name Display");
        System.out.println("Enter the month number between 1-12");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month){
            case 1:
                System.out.println("It is January Month");
                break;
            case 2:
                System.out.println("It is February Month");
                break;
            case 3:
                System.out.println("It is March Month");
                break;
            case 4:
                System.out.println("It is April Month");
                break;
            case 5:
                System.out.println("It is May Month");
                break;
            case 6:
                System.out.println("It it June Month");
                break;
            case 7:
                System.out.println("It is July Month");
                break;
            case 8:
                System.out.println("It is August Month");
                break;
            case 9:
                System.out.println("It is September Month");
                break;
            case 10:
                System.out.println("It is October Month");
                break;
            case 11:
                System.out.println("It is November Month");
                break;
            case 12:
                System.out.println("It is December Month");
                break;
            default:
                System.out.println("Invalid Input! Please enter the month between 1-12");
                break;
        }
    }
}
