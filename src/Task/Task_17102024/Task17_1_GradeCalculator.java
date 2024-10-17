package Task.Task_17102024;

import java.util.Scanner;

public class Task17_1_GradeCalculator {
    public static void main(String[] args) {


        int Obtained_Marks;
        System.out.println("Enter The Obtained Marks");
        Scanner scanner = new Scanner(System.in);
        Obtained_Marks = scanner.nextInt();

        if (Obtained_Marks >= 90 ){
            System.out.println("A Grade In Exams... Excellent You are Pass");

        } else if (Obtained_Marks >= 80 ) {
            System.out.println("B Grade In Exams... Very Good You are Pass");

        } else if (Obtained_Marks >= 70 ) {
            System.out.println("C Grade In Exams... Good You are Pass");

        } else if (Obtained_Marks >= 60 ) {
            System.out.println("D Grade In Exams...Push Pass");

        }else {
            System.out.println("Sorry Your are failed in exam... Better luck next time");
        }

    }
}
