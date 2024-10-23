package Task.Task_22102024;

import java.util.Scanner;

public class Task22_1_RevNum {

    public static void main(String[] args) {
        int num,r,sum=0;
        System.out.println("Enter the number for reverse");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        for(; num > 0 ; num = num/10){
            r = num%10;
            sum = sum *10 + r;

        }
        System.out.println("The reverse of the number is " + sum);
    }
}
