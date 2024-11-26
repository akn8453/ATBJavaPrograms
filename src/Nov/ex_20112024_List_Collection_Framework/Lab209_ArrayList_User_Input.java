package Nov.ex_20112024_List_Collection_Framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lab209_ArrayList_User_Input {
    public static void main(String[] args) {
       /*
       Multiple inputs from the user and store them in a separate
       arraylist based on user-defined categories
        */

// names, ages - store them
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();


         String continueInput = "Y"; //control variable for input loop

        while (continueInput.equalsIgnoreCase("Y")){

            System.out.print("Enter name:  ");
            String name = scanner.nextLine();
            names.add(name);

            System.out.print("Enter age:  ");
            int age = scanner.nextInt();
            ages.add(age);

            scanner.nextLine();
            System.out.println("Do you want to add other record? (Y/N): ");
            continueInput = scanner.nextLine();

        }

        //Displaying the collected data
        System.out.println("Names: " + names);
        System.out.println("Ages: "+ages);

        scanner.close();


        for (Object o1: names){
            System.out.println(o1);
        }

        for (Object o2: ages){
            System.out.println(o2);
        }


    }
}
