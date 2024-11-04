package Task.Task_30102024;

import java.util.Scanner;

public class Task30_LeftSideTraingle {
    public static void main(String[] args) {
        System.out.println("Please enter the number of rows ");
        Scanner scanner = new Scanner(System.in);
        int rows;
        rows = scanner.nextInt();
        for(int i = 0; rows >= i; rows-- ){
            for(int j = rows ; j >= i ;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
