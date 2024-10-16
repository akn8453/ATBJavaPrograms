package Task.Task_16102024;

import java.util.Scanner;
public class Task16_1_ScannerClass {
    public static void main(String[] args) {

        String Name ;
        int Age;
        float Salary;

        System.out.println("************** Employ Details *************");
        System.out.println("Please Enter The Employ Name");
        Scanner Str = new Scanner(System.in);
        Name = Str.nextLine();

        System.out.println("Please Enter The Employ Age");
        Scanner num1 = new Scanner(System.in);
        Age = num1.nextInt();

        System.out.println("Please Enter The Employ Salary");
        Scanner flt1 = new Scanner(System.in);
        Salary = flt1.nextFloat();

        System.out.println("Name: "+Name);
        System.out.println("Age: "+Age);
        System.out.println("Salary: "+Salary);

        Str.close();
        num1.close();
        flt1.close();


    }
}
