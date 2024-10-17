package Task.Task_17102024;

import java.util.Scanner;

public class Task17_2_Triangle_Classifier {
    public static void main(String[] args) {

        int Side1 ,Side2 ,Side3;
        System.out.println("Enter The Sides of Triangle");

        System.out.println("Enter The First Side Of Triangle");
        Scanner scanner1 = new Scanner (System.in);
        Side1 = scanner1.nextInt();

        System.out.println("Enter The Second Side Of Triangle");
        Scanner scanner2 = new Scanner (System.in);
        Side2 = scanner2.nextInt();

        System.out.println("Enter The Third Side Of Triangle");
        Scanner scanner3 = new Scanner (System.in);
        Side3 = scanner2.nextInt();

        if((Side1 == Side2) && (Side2 == Side3) ){
            System.out.println("It Is An Equilateral Triangle");

        } else if ((Side1 == Side2) || (Side2 == Side3)) {

            System.out.println("It Is An Isosceles  Triangle");
        }
        else {
            System.out.println("It Is An Scalene Triangle");
        }

    }
}
