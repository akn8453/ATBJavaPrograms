package Task.Task_29102024;

import java.util.Scanner;

public class Task29_3_DuplicateElement_WithoutFun {
    public static void main(String[] args) {

        System.out.println("Enter the size of the arrays ");
        Scanner scanner =  new Scanner(System.in);
        int size;
        size = scanner.nextInt();
        int [] number = new int [size];

        for (int i = 0; i <size ; i++) {
            System.out.println("Enter the numbers " + (i + 1));
            number[i] = scanner.nextInt();
        }

          boolean flag = false;
            for(int i = 0; i < number.length; i++){
                for (int j = i+1; j<number.length;j++){
                    if(number[i] == number[j]){
                        System.out.println("The duplicate number is found " + number[i]);
                        flag = true;
                    }

                }

            }
            if (flag == false){
                System.out.println("The duplicate number is not found ");
            }
    }
}
